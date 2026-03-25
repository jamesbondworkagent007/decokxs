package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wQw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52585wQw extends android.widget.LinearLayout {
    public final C50856vbz KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52585wQw(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52585wQw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.wQw.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52585wQw(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52585wQw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C50856vbz c50856vbzCopydefault = C50856vbz.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c50856vbzCopydefault, "");
        this.KWHzl = c50856vbzCopydefault;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wQv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52585wQw.OLrzqt();
            }
        });
        c50856vbzCopydefault.AEQbTJ.setText(C33070mpX.AYXKKw(C55688xof.Application.ITrustedWebActivityCallbackDefault));
        RecyclerView recyclerView = c50856vbzCopydefault.EZpvd;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(copydefault());
        copydefault().register(ItemData.class, new wNH(null, null, null, null, null, 31, null));
    }

    /* JADX INFO: renamed from: o.wQw$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wQw.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final C43316rmw OLrzqt() {
        return new C43316rmw();
    }

    private final C43316rmw copydefault() {
        return (C43316rmw) this.OLrzqt.getValue();
    }

    public final void setRewardsData(@NotNull TacticsVoucherInfo tacticsVoucherInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(tacticsVoucherInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C43316rmw c43316rmwCopydefault = copydefault();
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.cancelAll), C56068xvo.copydefault.AEQbTJ(str, str2, tacticsVoucherInfo.getTotalBonusAmount(), (536 & 8) != 0 ? "" : str3, (536 & 16) != 0, (536 & 32) != 0 ? false : true, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null), false, C56033xvF.OLrzqt((java.lang.Object) tacticsVoucherInfo.getTotalBonusAmount()), (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777204, (DefaultConstructorMarker) null));
        listOLrzqt.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.ITrustedWebActivityServiceStubProxy), pTB.formatLocalized$default(tacticsVoucherInfo.getPrincipalAmount(), null, 1, null) + " " + str3, false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        java.lang.String strCopydefault = copydefault(tacticsVoucherInfo.getBonusPeriod());
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ITrustedWebActivityServiceDefault);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        listOLrzqt.add(new ItemData(strAYXKKw, pTD.EZpvd(context, C55688xof.Activity.KWHzl, C33129mqd.AhwBna(strCopydefault), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(strCopydefault, null, 1, null)))), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        C33064mpR.OLrzqt(c43316rmwCopydefault, (java.util.List<? extends java.lang.Object>) C56402yEa.fARcdN(listOLrzqt));
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return java.lang.String.valueOf(C33129mqd.valueOf(str) / ((long) RemoteMessageConst.DEFAULT_TTL));
    }
}
