package o;

import com.okinc.business.market.common.constants.TokenAgeType;
import com.okinc.business.market.data.constant.AddressTrackerUserAction;
import com.okinc.business.market.features.address_tracker.domain.AddressTrackerNotification;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.FilterAction;
import com.okinc.business.market.features.filter.ui.FilterBottomSheetParams;
import com.okinc.business.market.features.filter.ui.TypeOptionParams;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.jUM;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jEK {
    public final android.content.Context EZpvd;
    public final AddressTrackerNotification OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final java.util.List<PriceRangeFilter> AEQbTJ = yDY.gEmmrt(new PriceRangeFilter("100", (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null), new PriceRangeFilter("500", (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null), new PriceRangeFilter("5000", (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null), new PriceRangeFilter("10000", (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null));

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AddressTrackerUserAction.values().length];
            try {
                iArr[AddressTrackerUserAction.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AddressTrackerUserAction.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd() {
        return "0";
    }

    public jEK(@NotNull android.content.Context context, @NotNull AddressTrackerNotification addressTrackerNotification) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(addressTrackerNotification, "");
        this.EZpvd = context;
        this.OLrzqt = addressTrackerNotification;
    }

    public final jUM copydefault() {
        return this.OLrzqt.KWHzl() ? KWHzl() : AEQbTJ();
    }

    public final jUM AEQbTJ() {
        jUM.StateListAnimator stateListAnimator = jUM.Companion;
        java.lang.String string = this.EZpvd.getString(C23274hvD.Fragment.UlpNxW);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.util.List<TypeOptionParams> listDjBIcL = djBIcL();
        java.util.List<PriceRangeFilter> list = AEQbTJ;
        TokenFilter tokenFilter = new TokenFilter(null, null, null, null, null, false, false, null, false, false, null, null, null, 8191, null);
        int i = C23274hvD.Fragment.UvfnWv;
        java.lang.String string2 = this.EZpvd.getString(C23274hvD.Fragment.sYOsaF);
        java.lang.String string3 = this.EZpvd.getString(C23274hvD.Fragment.ORxRYg);
        FilterAction.Cancel cancel = FilterAction.Cancel.KWHzl;
        FilterAction.Create create = new FilterAction.Create(this.OLrzqt.OLrzqt(), this.OLrzqt.copydefault());
        return stateListAnimator.KWHzl(new FilterBottomSheetParams(string, listDjBIcL, list, java.lang.Integer.valueOf(i), tokenFilter, new TokenFilter(null, null, "all", new PriceRangeFilter("100", "", (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 60, (DefaultConstructorMarker) null), null, false, false, null, false, false, null, null, null, 8115, null), null, null, null, string2, string3, create, cancel, false, false, true, false, 82368, null));
    }

    public final jUM KWHzl() {
        jUM.StateListAnimator stateListAnimator = jUM.Companion;
        java.lang.String string = this.EZpvd.getString(C23274hvD.Fragment.DXTac);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.util.List<TypeOptionParams> listDjBIcL = djBIcL();
        java.util.List<PriceRangeFilter> list = AEQbTJ;
        TokenFilter tokenFilter = new TokenFilter(null, null, null, null, null, false, false, null, false, false, null, null, null, 8191, null);
        int i = C23274hvD.Fragment.UvfnWv;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatApi21CallbackProxy);
        FilterAction.Delete delete = new FilterAction.Delete(this.OLrzqt.OLrzqt(), this.OLrzqt.copydefault());
        FilterAction.Update update = new FilterAction.Update(this.OLrzqt.OLrzqt(), this.OLrzqt.copydefault());
        return stateListAnimator.KWHzl(new FilterBottomSheetParams(string, listDjBIcL, list, java.lang.Integer.valueOf(i), tokenFilter, new TokenFilter(null, null, copydefault((AddressTrackerUserAction) CollectionsKt___CollectionsKt.firstOrNull(this.OLrzqt.AEQbTJ())), new PriceRangeFilter(C31256lqb.KWHzl(this.OLrzqt.AYXKKw(), (Function0<java.lang.String>) new Function0() { // from class: o.jEM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jEK.EZpvd();
            }
        }), this.OLrzqt.EZpvd(), (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 60, (DefaultConstructorMarker) null), null, false, false, null, false, false, null, null, null, 8115, null), null, null, null, null, strAYXKKw, update, delete, false, false, true, false, 91072, null));
    }

    public final java.util.List<TypeOptionParams> djBIcL() {
        java.lang.String string = this.EZpvd.getString(C23274hvD.Fragment.onPictureInPictureModeChanged);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TypeOptionParams typeOptionParams = new TypeOptionParams("all", string);
        java.lang.String string2 = this.EZpvd.getString(C23274hvD.Fragment.onPreparePanel);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TypeOptionParams typeOptionParams2 = new TypeOptionParams("buy", string2);
        java.lang.String string3 = this.EZpvd.getString(C23274hvD.Fragment.removeMenuProvider);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        return yDY.gEmmrt(typeOptionParams, typeOptionParams2, new TypeOptionParams("sell", string3));
    }

    public final java.lang.String copydefault(AddressTrackerUserAction addressTrackerUserAction) {
        int i = addressTrackerUserAction == null ? -1 : TaskDescription.EZpvd[addressTrackerUserAction.ordinal()];
        return i != 1 ? i != 2 ? "all" : "sell" : "buy";
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jEK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
