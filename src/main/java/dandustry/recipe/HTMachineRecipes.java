package dandustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.stack.UnificationEntry;

import static dandustry.item.DandustryMaterials.*;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.Europium;
import static gregtech.api.unification.material.Materials.SodiumPotassium;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.blocks.BlockMachineCasing.MachineCasingType.*;
import static gregtech.common.blocks.MetaBlocks.MACHINE_CASING;
import static gregtech.common.items.MetaItems.*;
import static gregtech.common.metatileentities.MetaTileEntities.*;

public class HTMachineRecipes {
    public static void init() {

        // Machine Casings

        ModHandler.addShapedRecipe(true, "casing_uev", MACHINE_CASING.getItemVariant(UEV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(plate, HastelloyK243));
        ModHandler.addShapedRecipe(true, "casing_uiv", MACHINE_CASING.getItemVariant(UIV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(plate, Enderiiium));
        ModHandler.addShapedRecipe(true, "casing_uxv", MACHINE_CASING.getItemVariant(UXV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(plate, AwakenedDraconium));
        ModHandler.addShapedRecipe(true, "casing_opv", MACHINE_CASING.getItemVariant(OpV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(plate, Quantum));
        ModHandler.addShapedRecipe(true, "casing_max", MACHINE_CASING.getItemVariant(MAX), "PPP", "PwP", "PPP", 'P', new UnificationEntry(plateDense, Floppa));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, HastelloyK243, 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(UEV))
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Enderiiium, 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(UIV))
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, AwakenedDraconium, 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(UXV))
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Quantum, 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(OpV))
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plateDense, Floppa, 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(MAX))
                .duration(50).EUt(16).buildAndRegister();

        // Machine Hull Assembler Recipes

        // TODO: idk how this works someone help
        //GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES, MACHINE_CASING.getItemVariant(UHV), new UnificationEntry(cableGtSingle, Europium), Polybenzimidazole.getFluid(288));

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(UHV))
                .input(cableGtSingle, Europium, 2)
                .fluidInputs(Teflon.getFluid(288))
                .output(HULL[GTValues.UHV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(UEV))
                .input(cableGtSingle, Lafium, 2)
                .fluidInputs(RadoxPolymer.getFluid(288))
                .output(HULL[GTValues.UEV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(UIV))
                .input(cableGtSingle, Signalium, 2)
                .fluidInputs(RadoxPolymer.getFluid(288))
                .output(HULL[GTValues.UIV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(UXV))
                .input(cableGtSingle, Bedrockium, 2)
                .fluidInputs(RadoxPolymer.getFluid(288))
                .output(HULL[GTValues.UXV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(OpV))
                .input(cableGtSingle, Quantium, 2)
                .fluidInputs(RadoxPolymer.getFluid(288))
                .output(HULL[GTValues.OpV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(MAX))
                .input(wireGtHex, Floppa, 2)
                .fluidInputs(Floppa.getFluid(2592))
                .output(HULL[GTValues.MAX])
                .duration(50).EUt(16).buildAndRegister();

        // Energy Output Hatches

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UEV])
                .input(spring, Lafium, 4)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 4)
                .input(circuit, MarkerMaterials.Tier.UEV)
                .input(wireGtDouble, MagnetoResonaticCinobitePikyoniumAluminum, 2)
                .fluidInputs(SodiumPotassium.getFluid(18000))
                .fluidInputs(MutatedLivingSolder.getFluid(576))
                .output(ENERGY_OUTPUT_HATCH[GTValues.UEV])
                .duration(1000).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UIV])
                .input(spring, Signalium, 4)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 8)
                .input(circuit, MarkerMaterials.Tier.UIV)
                .input(wireGtDouble, VibrantAlloyNaquadriaFluxedElectrumEnderiiumBase, 2)
                .fluidInputs(SodiumPotassium.getFluid(24000))
                .fluidInputs(MutatedLivingSolder.getFluid(1152))
                .output(ENERGY_OUTPUT_HATCH[GTValues.UIV])
                .duration(1000).EUt(VA[GTValues.UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UXV])
                .input(spring, Bedrockium, 4)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 16)
                .input(circuit, MarkerMaterials.Tier.UXV)
                .input(wireGtDouble, ChargedDraconiumStellarAlloyLuminessenceInfinityCatalyst, 2)
                .fluidInputs(SodiumPotassium.getFluid(32000))
                .fluidInputs(MutatedLivingSolder.getFluid(2304))
                .output(ENERGY_OUTPUT_HATCH[GTValues.UXV])
                .duration(1000).EUt(VA[GTValues.UXV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.OpV])
                .input(spring, Quantium, 4)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 32)
                .input(circuit, MarkerMaterials.Tier.OpV)
                .input(wireGtDouble, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus, 2)
                .fluidInputs(SodiumPotassium.getFluid(64000))
                .fluidInputs(MutatedLivingSolder.getFluid(4608))
                .output(ENERGY_OUTPUT_HATCH[GTValues.OpV])
                .duration(1000).EUt(VA[GTValues.OpV]).buildAndRegister();

        // Energy Input Hatches

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UEV])
                .input(cableGtSingle, Lafium, 4)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 4)
                .input(circuit, MarkerMaterials.Tier.UEV)
                .input(wireGtDouble, MagnetoResonaticCinobitePikyoniumAluminum, 2)
                .fluidInputs(SodiumPotassium.getFluid(18000))
                .fluidInputs(MutatedLivingSolder.getFluid(576))
                .output(ENERGY_INPUT_HATCH[GTValues.UEV])
                .duration(1000).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UIV])
                .input(cableGtSingle, Signalium, 4)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 8)
                .input(circuit, MarkerMaterials.Tier.UIV)
                .input(wireGtDouble, VibrantAlloyNaquadriaFluxedElectrumEnderiiumBase, 2)
                .fluidInputs(SodiumPotassium.getFluid(24000))
                .fluidInputs(MutatedLivingSolder.getFluid(1152))
                .output(ENERGY_INPUT_HATCH[GTValues.UIV])
                .duration(1000).EUt(VA[GTValues.UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UXV])
                .input(cableGtSingle, Bedrockium, 4)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 16)
                .input(circuit, MarkerMaterials.Tier.UXV)
                .input(wireGtDouble, ChargedDraconiumStellarAlloyLuminessenceInfinityCatalyst, 2)
                .fluidInputs(SodiumPotassium.getFluid(32000))
                .fluidInputs(MutatedLivingSolder.getFluid(2304))
                .output(ENERGY_INPUT_HATCH[GTValues.UXV])
                .duration(1000).EUt(VA[GTValues.UXV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.OpV])
                .input(cableGtSingle, Quantium, 4)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 32)
                .input(circuit, MarkerMaterials.Tier.OpV)
                .input(wireGtDouble, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus, 2)
                .fluidInputs(SodiumPotassium.getFluid(64000))
                .fluidInputs(MutatedLivingSolder.getFluid(4608))
                .output(ENERGY_INPUT_HATCH[GTValues.OpV])
                .duration(1000).EUt(VA[GTValues.OpV]).buildAndRegister();

        // Adjustable Transformers

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(TRANSFORMER[GTValues.UHV])
                .input(ELECTRIC_PUMP_IV)
                .input(wireGtQuadruple, Lafium)
                .input(wireGtOctal, Europium)
                .input(springSmall, Europium)
                .input(spring, Lafium)
                .fluidInputs(OmniversalLubricant.getFluid(1000))
                .output(ADJUSTABLE_TRANSFORMER[GTValues.UHV])
                .duration(200).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(TRANSFORMER[GTValues.UEV])
                .input(ELECTRIC_PUMP_LuV)
                .input(wireGtQuadruple, Signalium)
                .input(wireGtOctal, Lafium)
                .input(springSmall, Lafium)
                .input(spring, Signalium)
                .fluidInputs(OmniversalLubricant.getFluid(2000))
                .output(ADJUSTABLE_TRANSFORMER[GTValues.UEV])
                .duration(200).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(TRANSFORMER[GTValues.UIV])
                .input(ELECTRIC_PUMP_LuV)
                .input(wireGtQuadruple, Bedrockium)
                .input(wireGtOctal, Signalium)
                .input(springSmall, Signalium)
                .input(spring, Bedrockium)
                .fluidInputs(OmniversalLubricant.getFluid(4000))
                .output(ADJUSTABLE_TRANSFORMER[GTValues.UIV])
                .duration(200).EUt(VA[GTValues.UIV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(TRANSFORMER[GTValues.UXV])
                .input(ELECTRIC_PUMP_ZPM)
                .input(wireGtQuadruple, Quantium)
                .input(wireGtOctal, Bedrockium)
                .input(springSmall, Bedrockium)
                .input(spring, Quantium)
                .fluidInputs(OmniversalLubricant.getFluid(8000))
                .output(ADJUSTABLE_TRANSFORMER[GTValues.UXV])
                .duration(200).EUt(VA[GTValues.UXV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(TRANSFORMER[GTValues.OpV])
                .input(ELECTRIC_PUMP_ZPM)
                .input(wireGtQuadruple, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus)
                .input(wireGtOctal, Quantium)
                .input(springSmall, Quantium)
                .input(spring, Infinity)
                .fluidInputs(OmniversalLubricant.getFluid(16000))
                .output(ADJUSTABLE_TRANSFORMER[GTValues.OpV])
                .duration(200).EUt(VA[GTValues.OpV]).buildAndRegister();

        // TODO: Remove existing diode block recipes for UXV / OpV and replace them. i clearly have no idea what i am doing
        /*
        ModHandler.addShapedRecipe(true, "casing_uev", MACHINE_CASING.getItemVariant(UXV), "CDC", "DHD", "PDP",
                'C', new UnificationEntry(cableGtQuadruple, Bedrockium)
                'P', new UnificationEntry(plate, AwakenedDraconium))
                'H', new ItemStack(MACHINE_CASING.getItemVariant(UEV))
                'D', new ItemStack(SUPREME_SMD_DIODE.getStackForm());
        */

        // The stuff below is commented out because none of these things actually get generated at high tiers, probably by mistake. Uncomment it if that gets changed
        // 4A Energy Hatches
        /*
        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_INPUT_HATCH[GTValues.UEV], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 2)
                .input(wireGtDouble, MagnetoResonaticCinobitePikyoniumAluminum)
                .input(wireGtQuadruple, Lafium, 2)
                .output(ENERGY_INPUT_HATCH_4A[6])
                .duration(100).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_INPUT_HATCH[GTValues.UIV], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 4)
                .input(wireGtDouble, VibrantAlloyNaquadriaFluxedElectrumEnderiiumBase)
                .input(wireGtQuadruple, Signalium, 2)
                .output(ENERGY_INPUT_HATCH_4A[7])
                .duration(100).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_INPUT_HATCH[GTValues.UXV], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 8)
                .input(wireGtDouble, ChargedDraconiumStellarAlloyLuminessenceInfinityCatalyst)
                .input(wireGtQuadruple, Bedrockium, 2)
                .output(ENERGY_INPUT_HATCH_4A[8])
                .duration(100).EUt(VA[GTValues.UIV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_INPUT_HATCH[GTValues.OpV], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 16)
                .input(wireGtDouble, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus)
                .input(wireGtQuadruple, Bedrockium, 2)
                .output(ENERGY_INPUT_HATCH_4A[9])
                .duration(100).EUt(VA[GTValues.UXV]).buildAndRegister();

        // 16A Energy Hatches

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_INPUT_HATCH_4A[6], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 4)
                .input(wireGtDouble, MagnetoResonaticCinobitePikyoniumAluminum)
                .input(wireGtOctal, Lafium, 2)
                .output(ENERGY_INPUT_HATCH_16A[5])
                .duration(200).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_INPUT_HATCH_4A[7], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 8)
                .input(wireGtDouble, VibrantAlloyNaquadriaFluxedElectrumEnderiiumBase)
                .input(wireGtOctal, Signalium, 2)
                .output(ENERGY_INPUT_HATCH_16A[6])
                .duration(200).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_INPUT_HATCH_4A[8], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 16)
                .input(wireGtDouble, ChargedDraconiumStellarAlloyLuminessenceInfinityCatalyst)
                .input(wireGtOctal, Bedrockium, 2)
                .output(ENERGY_INPUT_HATCH_16A[7])
                .duration(200).EUt(VA[GTValues.UIV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_INPUT_HATCH_4A[9], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 32)
                .input(wireGtDouble, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus)
                .input(wireGtOctal, Quantium, 2)
                .output(ENERGY_INPUT_HATCH_16A[8])
                .duration(200).EUt(VA[GTValues.UXV]).buildAndRegister();

        // 4A Dynamo Hatches

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_OUTPUT_HATCH[GTValues.UEV], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 2)
                .input(wireGtDouble, MagnetoResonaticCinobitePikyoniumAluminum)
                .input(wireGtQuadruple, Lafium, 2)
                .output(ENERGY_OUTPUT_HATCH_4A[6])
                .duration(100).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_OUTPUT_HATCH[GTValues.UIV], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 4)
                .input(wireGtDouble, VibrantAlloyNaquadriaFluxedElectrumEnderiiumBase)
                .input(wireGtQuadruple, Signalium, 2)
                .output(ENERGY_OUTPUT_HATCH_4A[7])
                .duration(100).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_OUTPUT_HATCH[GTValues.UXV], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 8)
                .input(wireGtDouble, ChargedDraconiumStellarAlloyLuminessenceInfinityCatalyst)
                .input(wireGtQuadruple, Bedrockium, 2)
                .output(ENERGY_OUTPUT_HATCH_4A[8])
                .duration(100).EUt(VA[GTValues.UIV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_OUTPUT_HATCH[GTValues.OpV], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 16)
                .input(wireGtDouble, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus)
                .input(wireGtQuadruple, Quantium, 2)
                .output(ENERGY_OUTPUT_HATCH_4A[9])
                .duration(100).EUt(VA[GTValues.UXV]).buildAndRegister();

        // 16A Dynamo Hatches

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_OUTPUT_HATCH_4A[6], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 4)
                .input(wireGtDouble, MagnetoResonaticCinobitePikyoniumAluminum)
                .input(wireGtOctal, Lafium, 2)
                .output(ENERGY_OUTPUT_HATCH_16A[5])
                .duration(200).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_OUTPUT_HATCH_4A[7], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 8)
                .input(wireGtDouble, VibrantAlloyNaquadriaFluxedElectrumEnderiiumBase)
                .input(wireGtOctal, Signalium, 2)
                .output(ENERGY_OUTPUT_HATCH_16A[6])
                .duration(200).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_OUTPUT_HATCH_4A[8], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 16)
                .input(wireGtDouble, ChargedDraconiumStellarAlloyLuminessenceInfinityCatalyst)
                .input(wireGtOctal, Bedrockium, 2)
                .output(ENERGY_OUTPUT_HATCH_16A[7])
                .duration(200).EUt(VA[GTValues.UIV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ENERGY_OUTPUT_HATCH_4A[9], 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 32)
                .input(wireGtDouble, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus)
                .input(wireGtOctal, Quantium, 2)
                .output(ENERGY_OUTPUT_HATCH_16A[8])
                .duration(200).EUt(VA[GTValues.UXV]).buildAndRegister();

        // Rotor Holders

        ModHandler.addShapedRecipe(true, "rotor_holder_uhv", MetaTileEntities.ROTOR_HOLDER[6].getStackForm(), "SGS", "GHG", "SGS",
                'H', MetaTileEntities.HULL[GTValues.UHV].getStackForm(),
                'G', new UnificationEntry(gear, EnrichedNaquadahAlloy),
                'S', new UnificationEntry(gearSmall, Pikyonium));

        ModHandler.addShapedRecipe(true, "rotor_holder_uev", MetaTileEntities.ROTOR_HOLDER[7].getStackForm(), "SGS", "GHG", "SGS",
                'H', MetaTileEntities.HULL[GTValues.UEV].getStackForm(),
                'G', new UnificationEntry(gear, Aluminum),
                'S', new UnificationEntry(gearSmall, Lafium));

        ModHandler.addShapedRecipe(true, "rotor_holder_uiv", MetaTileEntities.ROTOR_HOLDER[8].getStackForm(), "SGS", "GHG", "SGS",
                'H', MetaTileEntities.HULL[GTValues.UIV].getStackForm(),
                'G', new UnificationEntry(gear, Lumiium),
                'S', new UnificationEntry(gearSmall, VibrantAlloy));

        ModHandler.addShapedRecipe(true, "rotor_holder_uxv", MetaTileEntities.ROTOR_HOLDER[9].getStackForm(), "SGS", "GHG", "SGS",
                'H', MetaTileEntities.HULL[GTValues.UXV].getStackForm(),
                'G', new UnificationEntry(gear, CrystalMatrix),
                'S', new UnificationEntry(gearSmall, Draconium));

        ModHandler.addShapedRecipe(true, "rotor_holder_opv", MetaTileEntities.ROTOR_HOLDER[10].getStackForm(), "SGS", "GHG", "SGS",
                'H', MetaTileEntities.HULL[GTValues.OpV].getStackForm(),
                'G', new UnificationEntry(gear, Quantium),
                'S', new UnificationEntry(gearSmall, Ledox));
         */
    }
}
