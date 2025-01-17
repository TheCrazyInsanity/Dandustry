package dandustry.recipe;

import gregtech.api.metatileentity.multiblock.CleanroomType;

import static dandustry.item.DandustryMaterials.*;
import static dandustry.item.DandustryMetaItems.*;
import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;

public class MagnetoResonaticRecipes {
    public static void init() {
        waferRecipes();
        componentRecipes();
        boardRecipes();
        circuitRecipes();
    }

    private static void waferRecipes() {

        LATHE_RECIPES.recipeBuilder()
                .input(plate, animalWaste)
                .output(lens, animalWaste).output(dustSmall, animalWaste)
                .duration(1200).EUt(120).buildAndRegister();

        LATHE_RECIPES.recipeBuilder()
                .input(plate, PolyvinylChloride)
                .output(lens, PolyvinylChloride).output(dustSmall, PolyvinylChloride)
                .duration(1200).EUt(120).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, MagnetoResonatic, 32)
                .input(dust, Quartzite, 8)
                .fluidInputs(Nitrogen.getFluid(8000))
                .output(MAGNETO_RESONATIC_BOULE)
                .blastFurnaceTemp(2484)
                .duration(12000).EUt(VA[HV]).buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(MAGNETO_RESONATIC_BOULE)
                .output(MAGNETO_RESONATIC_WAFER, 16)
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(800).EUt(VA[HV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(MAGNETO_RESONATIC_WAFER)
                .notConsumable(lens, MagnetoResonatic)
                .notConsumable(lens, animalWaste)
                .notConsumable(lens, PolyvinylChloride)
                .output(RESONANCE_WAFER)
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(900).EUt(VA[HV]).buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(RESONANCE_WAFER)
                .output(RESONANCE_CHIP, 4)
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(900).EUt(VA[HV]).buildAndRegister();
    }

    private static void boardRecipes() {
        CHEMICAL_RECIPES.recipeBuilder()
                .input(plate, RadoxPolymer)
                .input(foil, ChromaticGlass, 4)
                .fluidInputs(MagnetoResonatic.getFluid(144), EnrichedHolmium.getFluid(144), Teflon.getFluid(288))
                .output(COSMIC_CIRCUIT_BOARD)
                .EUt(VA[UV]).duration(400).buildAndRegister();
    }

    private static void componentRecipes() {

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(dust, EnderiiumBase)
                .input(wireFine, AwakenedDraconium, 4)
                .fluidInputs(RadoxPolymer.getFluid(72))
                .output(SUPREME_SMD_RESISTOR, 8)
                .EUt(VA[UHV]).duration(320).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(foil, ChargedDraconium)
                .input(wireFine, StellarAlloy, 8)
                .fluidInputs(RadoxPolymer.getFluid(72))
                .output(SUPREME_SMD_TRANSISTOR, 8)
                .EUt(VA[UHV]).duration(320).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(foil, Bedrockium, 2)
                .input(foil, CrystalMatrix)
                .fluidInputs(RadoxPolymer.getFluid(72))
                .output(SUPREME_SMD_CAPACITOR, 8)
                .EUt(VA[UHV]).duration(320).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(dust, AwakenedDraconium)
                .input(wireFine, ChargedDraconium, 4)
                .fluidInputs(RadoxPolymer.getFluid(72))
                .output(SUPREME_SMD_DIODE, 8)
                .EUt(VA[UHV]).duration(320).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ring, ChargedDraconium)
                .input(wireFine, Bedrockium, 4)
                .fluidInputs(RadoxPolymer.getFluid(72))
                .output(SUPREME_SMD_INDUCTOR, 8)
                .EUt(VA[UHV]).duration(320).buildAndRegister();
    }

    private static void circuitRecipes() {
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(GOOD_CIRCUIT_BOARD)
                .input(RESONANCE_CHIP, 2)
                .input(foil, Oxygen)
                .input(foil, RealCupronickel)
                .input(wireFine, TinAlloy)
                .input(ring, GalliumYttrium)
                .fluidInputs(MagnetoResonatic.getFluid(72))
                .output(MAGNETO_RESONATIC_ULV, 8)
                .duration(100).EUt(VA[LV]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(PLASTIC_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_ULV)
                .input(wireFine, TinAlloy, 2)
                .input(SMD_RESISTOR, 2)
                .input(SMD_TRANSISTOR, 2)
                .input(SMD_CAPACITOR, 2)
                .fluidInputs(MagnetoResonatic.getFluid(144))
                .output(MAGNETO_RESONATIC_LV)
                .duration(100).EUt(VA[MV]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(PLASTIC_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_LV)
                .input(wireFine, TinAlloy, 4)
                .input(SMD_RESISTOR, 4)
                .input(SMD_TRANSISTOR, 4)
                .input(SMD_CAPACITOR, 4)
                .fluidInputs(MagnetoResonatic.getFluid(144 + 72))
                .output(MAGNETO_RESONATIC_MV)
                .duration(100).EUt(VA[HV]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(ADVANCED_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_MV)
                .input(wireFine, TinAlloy, 8)
                .input(SMD_RESISTOR, 8)
                .input(SMD_TRANSISTOR, 8)
                .input(SMD_CAPACITOR, 8)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 2))
                .output(MAGNETO_RESONATIC_HV)
                .duration(100).EUt(VA[EV]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(EXTREME_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_HV)
                .input(wireFine, TinAlloy, 16)
                .input(SMD_RESISTOR, 16)
                .input(SMD_TRANSISTOR, 16)
                .input(SMD_CAPACITOR, 16)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 3))
                .output(MAGNETO_RESONATIC_EV)
                .duration(100).EUt(VA[IV]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(EXTREME_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_EV)
                .input(wireFine, TinAlloy, 32)
                .input(ADVANCED_SMD_RESISTOR, 16)
                .input(ADVANCED_SMD_TRANSISTOR, 16)
                .input(ADVANCED_SMD_CAPACITOR, 16)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 4))
                .output(MAGNETO_RESONATIC_IV)
                .duration(100).EUt(VA[LuV]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(ELITE_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_IV)
                .input(wireFine, TinAlloy, 64)
                .input(ADVANCED_SMD_RESISTOR, 24)
                .input(ADVANCED_SMD_TRANSISTOR, 24)
                .input(ADVANCED_SMD_CAPACITOR, 24)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 6))
                .output(MAGNETO_RESONATIC_LuV)
                .duration(100).EUt(VA[ZPM]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(ELITE_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_LuV)
                .input(wireFine, TinAlloy, 64)
                .input(ADVANCED_SMD_RESISTOR, 32)
                .input(ADVANCED_SMD_TRANSISTOR, 32)
                .input(ADVANCED_SMD_CAPACITOR, 32)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 8))
                .output(MAGNETO_RESONATIC_ZPM)
                .duration(100).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Tritanium)
                .input(WETWARE_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_ZPM)
                .input(RESONANCE_CHIP, 4)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 32)
                .input(ring, Teflon, 8)
                .input(ADVANCED_SMD_RESISTOR, 32)
                .input(ADVANCED_SMD_TRANSISTOR, 32)
                .input(ADVANCED_SMD_CAPACITOR, 32)
                .input(ADVANCED_SMD_DIODE, 32)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 12))
                .fluidInputs(TinAlloy.getFluid(144 * 6))
                .fluidInputs(animalWaste.getFluid(144 * 4))
                .output(MAGNETO_RESONATIC_UV)
                .duration(150).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HighDurabilityCompoundSteel)
                .input(WETWARE_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_UV)
                .input(RESONANCE_CHIP, 4)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 64)
                .input(ring, Teflon, 16)
                .input(ADVANCED_SMD_RESISTOR, 32)
                .input(ADVANCED_SMD_TRANSISTOR, 32)
                .input(ADVANCED_SMD_CAPACITOR, 32)
                .input(ADVANCED_SMD_DIODE, 32)
                .input(ADVANCED_SMD_INDUCTOR, 32)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 16))
                .fluidInputs(TinAlloy.getFluid(144 * 8))
                .fluidInputs(animalWaste.getFluid(144 * 6))
                .output(MAGNETO_RESONATIC_UHV)
                .duration(150).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HastelloyK243)
                .input(COSMIC_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_UHV)
                .input(RESONANCE_CHIP, 8)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 32)
                .input(ring, Teflon, 24)
                .input(ADVANCED_SMD_RESISTOR, 48)
                .input(ADVANCED_SMD_TRANSISTOR, 48)
                .input(ADVANCED_SMD_CAPACITOR, 48)
                .input(ADVANCED_SMD_DIODE, 48)
                .input(ADVANCED_SMD_INDUCTOR, 48)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 24))
                .fluidInputs(TinAlloy.getFluid(144 * 12))
                .fluidInputs(animalWaste.getFluid(144 * 8))
                .output(MAGNETO_RESONATIC_UEV)
                .duration(150).EUt(VA[UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder() // Doesn't work
                .input(frameGt, Enderiiium)
                .input(COSMIC_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_UEV)
                .input(RESONANCE_CHIP, 16)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 64)
                .input(plate, PreciousMetals, 4)
                .input(ring, Teflon, 32)
                .input(ADVANCED_SMD_RESISTOR, 64)
                .input(ADVANCED_SMD_TRANSISTOR, 64)
                .input(ADVANCED_SMD_CAPACITOR, 64)
                .input(ADVANCED_SMD_DIODE, 64)
                .input(ADVANCED_SMD_INDUCTOR, 64)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 32))
                .fluidInputs(TinAlloy.getFluid(144 * 16))
                .fluidInputs(animalWaste.getFluid(144 * 12))
                .output(MAGNETO_RESONATIC_UIV)
                .duration(150).EUt(VA[UXV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, InfinityCatalyst)
                .input(COSMIC_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_UIV)
                .input(RESONANCE_CHIP, 24)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 64)
                .input(plate, SuperheavyLAlloy, 4)
                .input(ring, Teflon, 48)
                .input(SUPREME_SMD_RESISTOR, 24)
                .input(SUPREME_SMD_TRANSISTOR, 24)
                .input(SUPREME_SMD_CAPACITOR, 24)
                .input(SUPREME_SMD_DIODE, 24)
                .input(SUPREME_SMD_INDUCTOR, 24)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 48))
                .fluidInputs(TinAlloy.getFluid(144 * 24))
                .fluidInputs(animalWaste.getFluid(144 * 16))
                .output(MAGNETO_RESONATIC_UXV)
                .duration(150).EUt(VA[OpV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Quantum)
                .input(COSMIC_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_UXV)
                .input(RESONANCE_CHIP, 32)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 64)
                .input(plate, SuperheavyHAlloy, 6)
                .input(ring, Teflon, 64)
                .input(SUPREME_SMD_RESISTOR, 32)
                .input(SUPREME_SMD_TRANSISTOR, 32)
                .input(SUPREME_SMD_CAPACITOR, 32)
                .input(SUPREME_SMD_DIODE, 32)
                .input(SUPREME_SMD_INDUCTOR, 32)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 64))
                .fluidInputs(TinAlloy.getFluid(144 * 32))
                .fluidInputs(animalWaste.getFluid(144 * 24))
                .output(MAGNETO_RESONATIC_OpV)
                .duration(150).EUt(VA[MAX]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, MultiversalAlloy)
                .input(COSMIC_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_OpV)
                .input(plate, Periodicium, 4)
                .input(plate, MultiversalAlloy, 8)
                .input(RESONANCE_CHIP, 64)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 64)
                .input(ring, Teflon, 64)
                .input(foil, EnrichedTeflon, 8)
                .input(SUPREME_SMD_RESISTOR, 64)
                .input(SUPREME_SMD_TRANSISTOR, 64)
                .input(SUPREME_SMD_CAPACITOR, 64)
                .input(SUPREME_SMD_DIODE, 64)
                .input(SUPREME_SMD_INDUCTOR, 64)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 128))
                .fluidInputs(TinAlloy.getFluid(144 * 64))
                .fluidInputs(animalWaste.getFluid(144 * 64))
                .fluidInputs(Shirabon.getFluid(144 * 8))
                .output(MAGNETO_RESONATIC_MAX)
                .duration(1500).EUt(VA[MAX]).buildAndRegister();
    }
}
