package xyz.aikoyori.aikoyoritweaks;

import net.fabricmc.api.ModInitializer;
import net.minecraft.world.GameRules;
import xyz.aikoyori.aikoyoritweaks.mixin.BooleanAccessor;
import xyz.aikoyori.aikoyoritweaks.mixin.GameRuleMixin;
import xyz.aikoyori.aikoyoritweaks.mixin.IntAccessor;

public class AikoyoriTweaks implements ModInitializer {

    public static final GameRules.Key<GameRules.BooleanRule> RAPID_FOLIAGE_BREAK =
            GameRuleMixin.invokeRegister("aikoyoriTweaks_rapidFoliageBreak", GameRules.Category.UPDATES, BooleanAccessor.invokeCreate(false));
    public static final GameRules.Key<GameRules.BooleanRule> ALLOW_DESTRIPPING =
            GameRuleMixin.invokeRegister("aikoyoriTweaks_allowDestripping", GameRules.Category.UPDATES, BooleanAccessor.invokeCreate(false));
    public static final GameRules.Key<GameRules.BooleanRule> BERRY_BUSH_DAMAGE =
            GameRuleMixin.invokeRegister("aikoyoriTweaks_doesBerryBushDamage", GameRules.Category.UPDATES, BooleanAccessor.invokeCreate(true));
    /*public static final GameRules.Key<GameRules.BooleanRule> BERRY_BUSH_SLOW =
            GameRuleMixin.invokeRegister("doesBerryBushSlowDown", GameRules.Category.UPDATES, GameRule$BooleanAccessor.invokeCreate(true));*/
    public static final GameRules.Key<GameRules.BooleanRule> CROPS_TRAMPLE =
            GameRuleMixin.invokeRegister("aikoyoriTweaks_doesCropTrampling", GameRules.Category.UPDATES, BooleanAccessor.invokeCreate(true));
    public static final GameRules.Key<GameRules.IntRule> TELEPORT_ITEM_COOLDOWN =
            GameRuleMixin.invokeRegister("aikoyoriTweaks_teleportItemCooldown", GameRules.Category.UPDATES, IntAccessor.invokeCreate(20));
    public static final GameRules.Key<GameRules.BooleanRule> MORE_CAULDRON_CLEANER =
            GameRuleMixin.invokeRegister("aikoyoriTweaks_cauldronsWashMoreThings", GameRules.Category.UPDATES, BooleanAccessor.invokeCreate(false));

    public static final GameRules.Key<GameRules.BooleanRule> HARVEST_CROPS_ON_USE =
            GameRuleMixin.invokeRegister("aikoyoriTweaks_allowHarvestingByRightClick", GameRules.Category.UPDATES, BooleanAccessor.invokeCreate(false));
    public static final GameRules.Key<GameRules.BooleanRule> CREEPER_GRIEFING =
            GameRuleMixin.invokeRegister("aikoyoriTweaks_doCreeperGriefing", GameRules.Category.UPDATES, BooleanAccessor.invokeCreate(true));

    public static final GameRules.Key<GameRules.BooleanRule> STONE_GENERATOR_VARIATION =
            GameRuleMixin.invokeRegister("aikoyoriTweaks_moreStoneGenerator", GameRules.Category.UPDATES, BooleanAccessor.invokeCreate(false));

    @Override
    public void onInitialize() {

    }
}
