package o;

import androidx.core.content.ContextCompat;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import com.okinc.tradingbot.impl.planet.model.BotDisplayType;
import com.okinc.tradingbot.impl.planet.model.BotUiState;
import com.okinc.tradingbot.impl.planet.model.PlanetBotMetadata;
import com.okinc.tradingbot.impl.planet.model.PlanetBotSelectedResult;
import com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import o.C48033uCm;
import o.C52761wXj;
import o.C53671wpr;
import o.tWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53655wpb implements tWX {
    public final PlanetPublisherPluginType copydefault = PlanetPublisherPluginType.BOTS;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final java.util.Set<PlanetPublisherPluginPreviewType> AEQbTJ = yEE.AhwBna(PlanetPublisherPluginPreviewType.LIST, PlanetPublisherPluginPreviewType.DETAIL);

    /* JADX INFO: renamed from: o.wpb$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BotDisplayType.values().length];
            try {
                iArr[BotDisplayType.YieldRatioOnly.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BotDisplayType.PnLAndYieldRatio.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    @Override // o.tWX
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.tWX
    public PlanetPublisherPluginType EZpvd() {
        return this.copydefault;
    }

    @Override // o.tWX
    public boolean OLrzqt() {
        return true;
    }

    @Override // o.tWX
    public void EZpvd(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull tWU twu) {
        tWX.Activity.copydefault(this, context, fragmentManager, twu);
    }

    @Override // o.tWX
    public boolean KWHzl() {
        return tWX.Activity.AEQbTJ(this);
    }

    /* JADX INFO: renamed from: o.wpb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wpb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.tWX
    public java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33070mpX.AYXKKw(C48033uCm.Fragment.RhjxDW);
    }

    @Override // o.tWX
    public android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getDrawable(context, C52761wXj.TaskDescription.DDxOgT);
    }

    @Override // o.tWX
    public java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginPreviewType, "");
        try {
            Result.Application application = Result.Companion;
            PlanetBotMetadata.Companion companion = PlanetBotMetadata.Companion;
            PlanetBotMetadata planetBotMetadataKWHzl = companion.KWHzl(str);
            if (Intrinsics.EZpvd(planetBotMetadataKWHzl, companion.KWHzl())) {
                throw new java.lang.IllegalArgumentException("Invalid metadata: failed to parse JSON string");
            }
            BotUiState botUiStateAEQbTJ = C53671wpr.Companion.OLrzqt().AEQbTJ(new C53671wpr.ActionBar(planetBotMetadataKWHzl, true, BotDisplayType.Companion.KWHzl(planetBotMetadataKWHzl.gEmmrt()), AEQbTJ.contains(planetPublisherPluginPreviewType)));
            pUU.KWHzl("BotPlanetPluginRegister", "Deeplink: " + botUiStateAEQbTJ.AhwBna().AhwBna());
            return Result.m7377constructorimpl(new tWV(new C53715wqi(context, null, 0, botUiStateAEQbTJ, planetPublisherPluginPreviewType, 6, null), botUiStateAEQbTJ.AhwBna().AhwBna(), botUiStateAEQbTJ.AhwBna().AYXKKw(), botUiStateAEQbTJ.valueOf(), OLrzqt(planetBotMetadataKWHzl, botUiStateAEQbTJ.OLrzqt())));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    @Override // o.tWX
    public void OLrzqt(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final tWW tww) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(tww, "");
        try {
            Result.Application application = Result.Companion;
            C49662usl.EZpvd(PlanetOngoingBotsBottomSheet.Companion.copydefault(new Function1() { // from class: o.wpi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53655wpb.KWHzl(tww, (PlanetBotSelectedResult) obj);
                }
            }), fragmentManager, "PlanetOngoingBotsBottomSheet");
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("BotPlanetPluginRegister", "Failed to show PlanetOngoingBotsBottomSheet", thM7380exceptionOrNullimpl);
            tww.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT));
        }
    }

    public static final Unit KWHzl(tWW tww, PlanetBotSelectedResult planetBotSelectedResult) {
        Intrinsics.checkNotNullParameter(planetBotSelectedResult, "");
        tww.copydefault(planetBotSelectedResult.EZpvd().AYXKKw());
        return Unit.INSTANCE;
    }

    @Override // o.tWX
    public void KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final java.lang.String str, @NotNull final tWW tww) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tww, "");
        C53657wpd.copydefault.OLrzqt();
        BotDisplayType botDisplayTypeOLrzqt = OLrzqt(str);
        try {
            Result.Application application = Result.Companion;
            C49662usl.EZpvd(C53712wqf.Companion.OLrzqt(botDisplayTypeOLrzqt, new Function1() { // from class: o.wpj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53655wpb.OLrzqt(this.EZpvd, str, tww, (BotDisplayType) obj);
                }
            }), fragmentManager, "PlanetBotEditBottomSheet");
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("BotPlanetPluginRegister", "Failed to show PlanetBotEditBottomSheet", thM7380exceptionOrNullimpl);
            tww.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT));
        }
    }

    public static final Unit OLrzqt(C53655wpb c53655wpb, java.lang.String str, tWW tww, BotDisplayType botDisplayType) {
        Intrinsics.checkNotNullParameter(botDisplayType, "");
        C53657wpd.copydefault.AEQbTJ(botDisplayType);
        PlanetBotMetadata planetBotMetadataAEQbTJ = c53655wpb.AEQbTJ(str, botDisplayType);
        if (Intrinsics.EZpvd(planetBotMetadataAEQbTJ, PlanetBotMetadata.Companion.KWHzl())) {
            pUU.copydefault("BotPlanetPluginRegister", "Failed to update metadata display type in onEdit callback");
            tww.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT));
        } else {
            tww.copydefault(planetBotMetadataAEQbTJ.AYXKKw());
        }
        return Unit.INSTANCE;
    }

    @Override // o.tWX
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C53657wpd.copydefault.AEQbTJ();
    }

    public final java.util.Map<java.lang.String, C46511tXa> OLrzqt(PlanetBotMetadata planetBotMetadata, BotDisplayType botDisplayType) {
        java.lang.String str;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = C56390yDp.OLrzqt("bot_type", new C46511tXa(planetBotMetadata.OLrzqt(), true));
        pairArr[1] = C56390yDp.OLrzqt("plugin_token", new C46511tXa(CollectionsKt___CollectionsKt.joinToString$default(planetBotMetadata.AkhnZx(), ",", null, null, 0, null, null, 62, null), false));
        int i = TaskDescription.OLrzqt[botDisplayType.ordinal()];
        if (i == 1) {
            str = "pnl_percentage";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "pnl_percentage_and_dollar";
        }
        pairArr[2] = C56390yDp.OLrzqt("plugin_option_pnl", new C46511tXa(str, true));
        return C56424yEw.gEmmrt(pairArr);
    }

    public final BotDisplayType OLrzqt(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        JsonPrimitive jsonPrimitive;
        try {
            Result.Application application = Result.Companion;
            JsonElement toJsonElement = C43284rmQ.KWHzl().parseToJsonElement(str);
            BotDisplayType.Application application2 = BotDisplayType.Companion;
            JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(toJsonElement).get((java.lang.Object) "displayType");
            objM7377constructorimpl = Result.m7377constructorimpl(application2.KWHzl((jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive)));
        } catch (java.lang.Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.OLrzqt("BotPlanetPluginRegister", "Failed to parse display type from metadata", thM7380exceptionOrNullimpl);
        }
        return (BotDisplayType) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final PlanetBotMetadata AEQbTJ(java.lang.String str, BotDisplayType botDisplayType) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            PlanetBotMetadata planetBotMetadata = (PlanetBotMetadata) C43284rmQ.KWHzl().decodeFromString(PlanetBotMetadata.Companion.serializer(), str);
            objM7377constructorimpl = Result.m7377constructorimpl(planetBotMetadata.AEQbTJ((31743 & 1) != 0 ? planetBotMetadata.algoId : null, (31743 & 2) != 0 ? planetBotMetadata.instIds : null, (31743 & 4) != 0 ? planetBotMetadata.instType : null, (31743 & 8) != 0 ? planetBotMetadata.pnl : null, (31743 & 16) != 0 ? planetBotMetadata.pnlRatio : null, (31743 & 32) != 0 ? planetBotMetadata.chartData : null, (31743 & 64) != 0 ? planetBotMetadata.additionalInfo : null, (31743 & 128) != 0 ? planetBotMetadata.name : null, (31743 & 256) != 0 ? planetBotMetadata.botType : null, (31743 & 512) != 0 ? planetBotMetadata.deeplink : null, (31743 & 1024) != 0 ? planetBotMetadata.displayType : botDisplayType.getValue(), (31743 & 2048) != 0 ? planetBotMetadata.pnlCcy : null, (31743 & 4096) != 0 ? planetBotMetadata.pTime : null, (31743 & 8192) != 0 ? planetBotMetadata.precision : null, (31743 & 16384) != 0 ? planetBotMetadata.coinUrls : null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("BotPlanetPluginRegister", "Failed to update metadata display type", thM7380exceptionOrNullimpl);
            objM7377constructorimpl = PlanetBotMetadata.Companion.KWHzl();
        }
        return (PlanetBotMetadata) objM7377constructorimpl;
    }
}
