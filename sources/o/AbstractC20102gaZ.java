package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.ContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.MevInfo;
import com.okinc.components.track.TrackChannel;
import com.okinc.core.util.SPUtils;
import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopHeaderInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC20082gaF;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gaZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20102gaZ<T extends OKWBaseTransaction<?>> extends AbstractC20082gaF<T> {
    public C57437yiR AuCTel;
    public android.widget.TextView DbNXlk;
    public C57436yiQ ejfBZ;
    public C57426yiG fIwbmz;
    public android.view.View fJNWhG;
    public android.view.View isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57437yiR DTwDnp() {
        return this.AuCTel;
    }

    @Override // o.AbstractC20082gaF
    public boolean uzCIH() {
        return false;
    }

    @Override // o.AbstractC20082gaF
    public void EZpvd(@NotNull AbstractC20082gaF<T>.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        C57436yiQ c57436yiQQKVWgx = QKVWgx();
        c57436yiQQKVWgx.setVisibility(8);
        this.ejfBZ = c57436yiQQKVWgx;
        actionBar.OLrzqt(c57436yiQQKVWgx);
        android.view.View viewLineView$default = lineView$default(this, 0, 0, 3, null);
        viewLineView$default.setVisibility(8);
        this.fJNWhG = viewLineView$default;
        actionBar.OLrzqt(viewLineView$default);
    }

    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull AbstractC20082gaF<T>.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        android.view.View viewLineView$default = lineView$default(this, 0, 0, 3, null);
        viewLineView$default.setVisibility(8);
        this.isConnected = viewLineView$default;
        actionBar.OLrzqt(viewLineView$default);
        C57426yiG c57426yiGORxRYg = ORxRYg();
        c57426yiGORxRYg.setVisibility(8);
        this.fIwbmz = c57426yiGORxRYg;
        actionBar.OLrzqt(c57426yiGORxRYg);
        C57437yiR c57437yiRQOLQEE = QOLQEE();
        c57437yiRQOLQEE.setVisibility(8);
        this.AuCTel = c57437yiRQOLQEE;
        actionBar.OLrzqt(c57437yiRQOLQEE);
    }

    public final C57436yiQ QKVWgx() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C57436yiQ(contextRequireContext, null, 0, 6, null);
    }

    public static /* synthetic */ void updateReminder$default(AbstractC20102gaZ abstractC20102gaZ, TransactionTopReminderInfoBean transactionTopReminderInfoBean, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateReminder");
        }
        if ((i & 1) != 0) {
            transactionTopReminderInfoBean = null;
        }
        abstractC20102gaZ.KWHzl(transactionTopReminderInfoBean);
    }

    public final void KWHzl(TransactionTopReminderInfoBean transactionTopReminderInfoBean) {
        C57436yiQ c57436yiQ = this.ejfBZ;
        if (c57436yiQ != null) {
            if (transactionTopReminderInfoBean == null || transactionTopReminderInfoBean.getOriginText().length() == 0) {
                c57436yiQ.setVisibility(8);
            } else {
                c57436yiQ.setVisibility(0);
                c57436yiQ.setViewDataBean(transactionTopReminderInfoBean);
            }
        }
        QfsBiF();
    }

    public static /* synthetic */ android.view.View lineView$default(AbstractC20102gaZ abstractC20102gaZ, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lineView");
        }
        if ((i3 & 1) != 0) {
            i = C55298xhM.dpInt$default(0.5f, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        if ((i3 & 2) != 0) {
            i2 = C52761wXj.Activity.AwvSrB;
        }
        return abstractC20102gaZ.KWHzl(i, i2);
    }

    public final android.view.View KWHzl(int i, int i2) {
        android.view.View view = new android.view.View(requireContext());
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, i));
        view.setBackgroundColor(C33070mpX.copydefault(i2));
        return view;
    }

    public final C57426yiG ORxRYg() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C57426yiG(contextRequireContext, null, 0, 6, null);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C57426yiG c57426yiG = this.fIwbmz;
        if (c57426yiG != null) {
            c57426yiG.setText(str);
        }
        C57426yiG c57426yiG2 = this.fIwbmz;
        if (c57426yiG2 != null) {
            c57426yiG2.setVisibility(0);
        }
        RJOkX();
    }

    public final C57437yiR QOLQEE() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C57437yiR(contextRequireContext, null, 2, null);
    }

    public static /* synthetic */ void showTotalCostView$default(AbstractC20102gaZ abstractC20102gaZ, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTotalCostView");
        }
        if ((i & 1) != 0) {
            str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.dcEsSD);
        }
        abstractC20102gaZ.OLrzqt(str, str2);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C57437yiR c57437yiR = this.AuCTel;
        if (c57437yiR != null) {
            c57437yiR.setTitle(str);
        }
        C57437yiR c57437yiR2 = this.AuCTel;
        if (c57437yiR2 != null) {
            c57437yiR2.setValue(str2);
        }
        C57437yiR c57437yiR3 = this.AuCTel;
        if (c57437yiR3 != null) {
            c57437yiR3.setVisibility(0);
        }
        RJOkX();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.gaZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C57431yiL titleInfoView$default(AbstractC20102gaZ abstractC20102gaZ, java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.graphics.drawable.Drawable drawable, Function0 function0, int i, java.lang.Object obj2) {
        if (obj2 == null) {
            return abstractC20102gaZ.OLrzqt(obj, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : drawable, (i & 64) != 0 ? null : function0);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: titleInfoView");
    }

    public final C57431yiL OLrzqt(java.lang.Object obj, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, android.graphics.drawable.Drawable drawable, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57431yiL c57431yiL = new C57431yiL(contextRequireContext, null, 0, 6, null);
        c57431yiL.setViewDataBean(new TransactionTopHeaderInfoBean(obj, drawable, str, function0 != null ? C33070mpX.KWHzl(C52761wXj.TaskDescription.GGlJim) : null, function0, str3, str4, str2));
        return c57431yiL;
    }

    public final C57422yiC OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, Function0<Unit> function0, android.graphics.drawable.Drawable drawable, java.lang.Object obj, @NotNull java.lang.String str3) {
        android.graphics.drawable.Drawable drawableOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57422yiC c57422yiC = new C57422yiC(contextRequireContext, null, 0, 6, null);
        if (drawable == null) {
            C14726dqr c14726dqr = C14726dqr.OLrzqt;
            android.content.Context context = c57422yiC.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            drawableOLrzqt = c14726dqr.OLrzqt(context);
        } else {
            drawableOLrzqt = drawable;
        }
        c57422yiC.setViewDataBean(new TransactionHeaderInfoBean(str, C56402yEa.EZpvd(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, obj, null, drawableOLrzqt, null, str3, null, false, null, null, null, 0, null, null, null, null, null, 1048239, null)), false, null, null, str2, function0, 28, null));
        return c57422yiC;
    }

    public final android.view.View AEQbTJ(@NotNull java.lang.String str, java.lang.Object obj, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57422yiC c57422yiC = new C57422yiC(contextRequireContext, null, 0, 6, null);
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        android.content.Context context = c57422yiC.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c57422yiC.setViewDataBean(new TransactionHeaderInfoBean(str, C56402yEa.EZpvd(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, obj, null, c14726dqr.KWHzl(context), null, str2, null, false, null, null, null, 0, null, null, null, null, null, 1048239, null)), false, null, null, null, null, 124, null));
        return c57422yiC;
    }

    public static /* synthetic */ C57457yil walletUsedView$default(AbstractC20102gaZ abstractC20102gaZ, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: walletUsedView");
        }
        if ((i & 1) != 0) {
            str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1);
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return abstractC20102gaZ.copydefault(str, str2);
    }

    public final C57457yil copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return addressView$default(this, str, ejfBZ().spnCvw(), null, null, null, str2, true, new Function1() { // from class: o.gbg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20102gaZ.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        }, false, null, 796, null);
    }

    public static final Unit OLrzqt(AbstractC20102gaZ abstractC20102gaZ, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        abstractC20102gaZ.sSMYrx();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ C57457yil mevInfoView$default(AbstractC20102gaZ abstractC20102gaZ, boolean z, java.lang.Boolean bool, java.util.List list, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mevInfoView");
        }
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return abstractC20102gaZ.copydefault(z, bool, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C57457yil copydefault(boolean z, java.lang.Boolean bool, final java.util.List<MevInfo.MevNode> list) {
        java.lang.String strAYXKKw;
        int iCopydefault;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean zEjfBZ = false;
        if (z) {
            BaseSignData baseSignDataQVsKAR = ejfBZ().QVsKAR();
            if (list != null && !list.isEmpty()) {
                if (baseSignDataQVsKAR instanceof ContractSignData) {
                    ContractSignData contractSignData = (ContractSignData) baseSignDataQVsKAR;
                    if (contractSignData.isOpenMEV() != null) {
                        java.lang.Boolean boolIsOpenMEV = contractSignData.isOpenMEV();
                        Intrinsics.copydefault(boolIsOpenMEV);
                        zEjfBZ = boolIsOpenMEV.booleanValue();
                    } else if (SPUtils.contains("is_dapp_mev_on")) {
                        zEjfBZ = SPUtils.getBoolean("is_dapp_mev_on", false);
                    } else {
                        zEjfBZ = Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE);
                    }
                }
            }
        } else if (ejfBZ() instanceof InterfaceC9743bbO) {
            T tEjfBZ = ejfBZ();
            Intrinsics.copydefault(tEjfBZ, "");
            zEjfBZ = ((InterfaceC9743bbO) tEjfBZ).ejfBZ();
        }
        booleanRef.element = zEjfBZ;
        if (zEjfBZ) {
            OLrzqt(list);
        } else {
            hDKMBd();
        }
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl61);
        if (booleanRef.element) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onAnimationEnd);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onAnimationStart);
        }
        if (booleanRef.element) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DcMfJK);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        return addressView$default(this, strAYXKKw2, strAYXKKw, java.lang.Integer.valueOf(iCopydefault), null, null, null, false, null, true, new Function1() { // from class: o.gbd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20102gaZ.KWHzl(booleanRef, list, this, (C57457yil) obj);
            }
        }, 248, null);
    }

    public static final Unit KWHzl(final Ref.BooleanRef booleanRef, final java.util.List list, final AbstractC20102gaZ abstractC20102gaZ, final C57457yil c57457yil) {
        Intrinsics.checkNotNullParameter(c57457yil, "");
        C20281gdt.Companion.EZpvd(booleanRef.element, list, new Function1() { // from class: o.gbi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20102gaZ.OLrzqt(booleanRef, c57457yil, abstractC20102gaZ, list, ((java.lang.Boolean) obj).booleanValue());
            }
        }).show(abstractC20102gaZ.getChildFragmentManager(), "javaClass");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Ref.BooleanRef booleanRef, C57457yil c57457yil, AbstractC20102gaZ abstractC20102gaZ, java.util.List list, boolean z) {
        booleanRef.element = z;
        SPUtils.put("is_dapp_mev_on", java.lang.Boolean.valueOf(z));
        if (booleanRef.element) {
            c57457yil.copydefault().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onAnimationEnd));
            c57457yil.copydefault().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DcMfJK));
            abstractC20102gaZ.OLrzqt((java.util.List<MevInfo.MevNode>) list);
        } else {
            c57457yil.copydefault().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onAnimationStart));
            c57457yil.copydefault().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            abstractC20102gaZ.hDKMBd();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: o.gaZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C57457yil addressView$default(AbstractC20102gaZ abstractC20102gaZ, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, Function1 function1, boolean z2, Function1 function12, int i, java.lang.Object obj) {
        java.lang.String string;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addressView");
        }
        java.lang.Integer num2 = (i & 4) != 0 ? null : num;
        java.lang.String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 16) != 0) {
            string = Intrinsics.EZpvd((java.lang.Object) abstractC20102gaZ.ejfBZ().spnCvw(), (java.lang.Object) str2) ? C14733dqy.copydefault.KWHzl(abstractC20102gaZ.ejfBZ().dUDNAs()).toString() : "";
        } else {
            string = str4;
        }
        return abstractC20102gaZ.copydefault(str, str2, num2, str6, string, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : function1, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : function12);
    }

    public final C57457yil copydefault(@NotNull java.lang.String str, @NotNull final java.lang.String str2, java.lang.Integer num, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, final Function1<? super java.lang.String, Unit> function1, boolean z2, final Function1<? super C57457yil, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final C57457yil c57457yil = new C57457yil(contextRequireContext, null, 0, 6, null);
        c57457yil.setViewDataBean(new TransactionAddressInfoBean(str, str2, str4, str5, z, new Function0() { // from class: o.gbh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20102gaZ.OLrzqt(this.copydefault, str2, function1, c57457yil);
            }
        }, str3, z2, function12 != null ? new Function0() { // from class: o.gbm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20102gaZ.OLrzqt(function12, c57457yil);
            }
        } : null));
        if (num != null) {
            c57457yil.copydefault().setTextColor(num.intValue());
        }
        return c57457yil;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction] */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction] */
    public static final Unit OLrzqt(AbstractC20102gaZ abstractC20102gaZ, java.lang.String str, Function1 function1, C57457yil c57457yil) {
        if (Intrinsics.EZpvd((java.lang.Object) abstractC20102gaZ.ejfBZ().spnCvw(), (java.lang.Object) str) && !abstractC20102gaZ.ejfBZ().dUDNAs().zLjUOn()) {
            C55326xho.toast$default(C13754dXa.FragmentManager.HJWChPdIKEqB, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        if (function1 != null) {
            function1.invoke(str);
        }
        android.content.Context context = c57457yil.getContext();
        java.lang.Object systemService = context != null ? context.getSystemService("clipboard") : null;
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), str).KWHzl(c57457yil.getContext());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, C57457yil c57457yil) {
        function1.invoke(c57457yil);
        return Unit.INSTANCE;
    }

    public final C57457yil OcIXYQ() {
        PlatformItem dapp = ejfBZ().OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        if (urlOnlyHost == null || urlOnlyHost.length() == 0) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57457yil c57457yil = new C57457yil(contextRequireContext, null, 0, 6, null);
        c57457yil.setViewDataBean(new TransactionAddressInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.openFileOutput), urlOnlyHost, (java.lang.String) null, (java.lang.String) null, false, (Function0) null, (java.lang.String) null, false, (Function0) null, TypedValues.PositionType.TYPE_CURVE_FIT, (DefaultConstructorMarker) null));
        return c57457yil;
    }

    public static /* synthetic */ C57464yis moreView$default(AbstractC20102gaZ abstractC20102gaZ, boolean z, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moreView");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline0);
        }
        return abstractC20102gaZ.AEQbTJ(z, str, function1);
    }

    public final C57464yis AEQbTJ(boolean z, @NotNull java.lang.String str, @NotNull Function1<? super AbstractC20082gaF<T>.ActionBar, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57464yis c57464yis = new C57464yis(contextRequireContext, null, 0, 6, null);
        function1.invoke(new AbstractC20082gaF.ActionBar(this, c57464yis));
        if (c57464yis.getChildCount() == 0) {
            return null;
        }
        c57464yis.setViewDataBean(new TransactionFoldInfoDataBean(str, z, new Function0() { // from class: o.gbf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20102gaZ.zuBGHE();
            }
        }));
        return c57464yis;
    }

    public static final Unit zuBGHE() {
        C32866mlf.onEvent$default("app_web3_wallet_transaction_scam_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ android.view.View[] normalDataInMoreView$default(AbstractC20102gaZ abstractC20102gaZ, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: normalDataInMoreView");
        }
        if ((i & 1) != 0) {
            str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDPHOMC);
        }
        return abstractC20102gaZ.EZpvd(str, str2);
    }

    public final android.view.View[] EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return null;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(requireContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
        appCompatTextView.setLayoutParams(marginLayoutParams);
        appCompatTextView.setText(str);
        appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        appCompatTextView.setTextAppearance(C52761wXj.LoaderManager.RdAHlO);
        Unit unit = Unit.INSTANCE;
        AppCompatTextView appCompatTextViewKWHzl = KWHzl(str2);
        this.DbNXlk = appCompatTextViewKWHzl;
        return new android.view.View[]{appCompatTextView, appCompatTextViewKWHzl};
    }

    public final AppCompatTextView KWHzl(java.lang.String str) {
        final AppCompatTextView appCompatTextView = new AppCompatTextView(requireContext());
        appCompatTextView.setText(str);
        appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        appCompatTextView.setTextAppearance(C52761wXj.LoaderManager.OBJEWx);
        appCompatTextView.setTextSize(16.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
        appCompatTextView.setLayoutParams(marginLayoutParams);
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: o.gbe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC20102gaZ.AEQbTJ(this.AEQbTJ, appCompatTextView, view);
            }
        });
        return appCompatTextView;
    }

    public static final void AEQbTJ(AbstractC20102gaZ abstractC20102gaZ, AppCompatTextView appCompatTextView, android.view.View view) {
        java.lang.Object systemService = abstractC20102gaZ.requireActivity().getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) systemService;
        java.lang.CharSequence text = appCompatTextView.getText();
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, text != null ? text.toString() : null));
        java.lang.String string = abstractC20102gaZ.getString(C13754dXa.FragmentManager.setProfilesSinceInitCount);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
    }

    public void EZpvd(java.lang.String str) {
        android.widget.TextView textView = this.DbNXlk;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void QfsBiF() {
        android.view.View view = this.fJNWhG;
        if (view != null) {
            view.setVisibility(8);
        }
        android.view.View view2 = this.fJNWhG;
        if (view2 != null) {
            view2.setVisibility(DbNXlk().KWHzl() ^ true ? 0 : 8);
        }
    }

    public final void RJOkX() {
        android.view.View view = this.isConnected;
        if (view != null) {
            view.setVisibility(8);
        }
        android.view.View view2 = this.isConnected;
        if (view2 != null) {
            view2.setVisibility(fetchVPNInfo().KWHzl() ^ true ? 0 : 8);
        }
    }
}
