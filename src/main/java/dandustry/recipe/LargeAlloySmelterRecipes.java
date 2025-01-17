package dandustry.recipe;

import static dandustry.item.DandustryMaterials.*;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.FUSION_RECIPES;
import static gregtech.api.unification.material.Materials.*;

public class LargeAlloySmelterRecipes {

    public static void init() {

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Gold.getFluid(128)).fluidInputs(Thaumium.getFluid(128))
                .fluidOutputs(InfusedGold.getFluid(64))
                .duration(50).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(128)).fluidInputs(TinAlloy.getFluid(64))
                .fluidOutputs(Water.getPlasma(64))
                .duration(100).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Aluminium.getFluid(128)).fluidInputs(Neutronium.getFluid(128))
                .fluidOutputs(Aluminum.getFluid(64))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Uranium238.getFluid(128)).fluidInputs(Neutronium.getFluid(64))
                .fluidOutputs(TastyNeutronium.getFluid(32))
                .duration(260).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(ChargedDraconium.getFluid(64)).fluidInputs(TastyNeutronium.getFluid(64))
                .fluidOutputs(AwakenedDraconium.getFluid(32))
                .duration(260).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(InfinityCatalyst.getFluid(128)).fluidInputs(TastyNeutronium.getFluid(128))
                .fluidOutputs(Infinity.getFluid(32))
                .duration(400).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Infinity.getFluid(64)).fluidInputs(Quantium.getFluid(128))
                .fluidOutputs(Shirabon.getFluid(32))
                .duration(600).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();
    }
}
