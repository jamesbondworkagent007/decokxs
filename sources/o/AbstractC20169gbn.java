package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.PointerIconCompat;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.ContractSignData;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataShowModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.MevInfo;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.RiskPopupInfo;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TabListModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain;
import com.okinc.components.track.TrackChannel;
import com.okinc.core.util.SPUtils;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.wallet.api.bean.WalletBtcAddressBean;
import com.okinc.web3Uilib.bean.TransactionAddressPermissionInfoBean;
import com.okinc.web3Uilib.bean.TransactionInfoRowBean;
import com.okinc.web3Uilib.uilib3.OKWeb3TXDataInputView;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC20481ghh;
import o.C13754dXa;
import o.C20537gik;
import o.C52761wXj;
import o.C57504yjf;
import o.C57512yjn;
import o.C57513yjo;
import o.C57517yjs;
import o.C57519yju;
import o.C57523yjy;
import o.C57524yjz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gbn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC20169gbn<T extends OKWBaseTransaction<?>> extends AbstractC20082gaF<T> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public OKAlertBanner AuCTel;
    public C57426yiG DbNXlk;
    public android.view.View isConnected;

    /* JADX INFO: renamed from: o.gbn$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gbn.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractC20082gaF
    public void EZpvd(@NotNull AbstractC20082gaF<T>.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        OKAlertBanner oKAlertBanner = new OKAlertBanner(contextRequireContext, null, 0, 6, null);
        oKAlertBanner.setVisibility(8);
        this.AuCTel = oKAlertBanner;
        actionBar.OLrzqt(oKAlertBanner);
    }

    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull AbstractC20082gaF<T>.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        android.view.View viewLineView$default = lineView$default(this, 0, 0, 0, 5, null);
        viewLineView$default.setVisibility(8);
        this.isConnected = viewLineView$default;
        actionBar.OLrzqt(viewLineView$default);
        C57426yiG c57426yiGOLrzqt = OLrzqt();
        c57426yiGOLrzqt.setVisibility(8);
        this.DbNXlk = c57426yiGOLrzqt;
        actionBar.OLrzqt(c57426yiGOLrzqt);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: o.gbn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showHeaderReminder$default(AbstractC20169gbn abstractC20169gbn, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, java.lang.String str4, Function0 function02, java.lang.String str5, Function0 function03, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showHeaderReminder");
        }
        abstractC20169gbn.EZpvd(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : function02, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? function03 : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [136=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, Function0<Unit> function0, java.lang.String str4, Function0<Unit> function02, java.lang.String str5, Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(str, "");
        OKAlertBanner oKAlertBanner = this.AuCTel;
        if (oKAlertBanner != null) {
            switch (str.hashCode()) {
                case -1039745817:
                    if (str.equals("normal")) {
                        oKAlertBanner.setVisibility(0);
                        oKAlertBanner.setType(4);
                    }
                    break;
                case -681210700:
                    if (str.equals("highlight")) {
                        oKAlertBanner.setVisibility(0);
                        oKAlertBanner.setType(1);
                        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.GGlJim);
                        if (drawableKWHzl != null) {
                            drawableKWHzl.setTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.sbu)));
                        } else {
                            drawableKWHzl = null;
                        }
                        oKAlertBanner.setLeadingIcon(drawableKWHzl);
                    }
                    break;
                case 3202370:
                    if (str.equals("hide")) {
                        oKAlertBanner.setVisibility(8);
                    }
                    break;
                case 93832333:
                    if (str.equals("block")) {
                        oKAlertBanner.setVisibility(0);
                        oKAlertBanner.setType(2);
                    }
                    break;
            }
            oKAlertBanner.setTitle(str2);
            oKAlertBanner.setMessage(str3);
            if (function0 != null) {
                oKAlertBanner.setStyle(1);
                oKAlertBanner.setOnClickListener(new Application(oKAlertBanner, 1000L, function0));
            } else {
                oKAlertBanner.setStyle(-1);
                oKAlertBanner.setOnClickListener(null);
            }
            oKAlertBanner.setPrimaryAction(str4, function02);
            oKAlertBanner.setSecondaryAction(str5, function03);
        }
    }

    /* JADX INFO: renamed from: o.gbn$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }

    /* JADX DEBUG: Possible override for method o.gaF.OLrzqt()V */
    public final C57426yiG OLrzqt() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C57426yiG(contextRequireContext, null, 0, 6, null);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C57426yiG c57426yiG = this.DbNXlk;
        if (c57426yiG != null) {
            c57426yiG.setText(str);
        }
        C57426yiG c57426yiG2 = this.DbNXlk;
        if (c57426yiG2 != null) {
            c57426yiG2.setVisibility(0);
        }
        QOLQEE();
    }

    public static /* synthetic */ android.view.View lineView$default(AbstractC20169gbn abstractC20169gbn, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lineView");
        }
        if ((i4 & 1) != 0) {
            i = C55298xhM.dpInt$default(0.5f, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        if ((i4 & 2) != 0) {
            i2 = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        if ((i4 & 4) != 0) {
            i3 = C52761wXj.Activity.AwvSrB;
        }
        return abstractC20169gbn.OLrzqt(i, i2, i3);
    }

    public final android.view.View OLrzqt(int i, int i2, int i3) {
        android.view.View view = new android.view.View(requireContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, i);
        marginLayoutParams.leftMargin = i2;
        marginLayoutParams.rightMargin = i2;
        view.setLayoutParams(marginLayoutParams);
        view.setBackgroundColor(C33070mpX.copydefault(i3));
        return view;
    }

    public final C57524yjz OLrzqt(java.lang.Object obj, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @androidx.annotation.ColorRes java.lang.Integer num) {
        final int iCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57524yjz c57524yjz = new C57524yjz(contextRequireContext, null, 0, 6, null);
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (num != null) {
            iCopydefault = C33070mpX.copydefault(num.intValue());
        } else if (z) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.gdmIOq);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
        }
        if (obj == null) {
            listOLrzqt.add(new C57524yjz.ActionBar(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C13754dXa.FragmentManager.initializePanelContent, C56423yEv.EZpvd(C56390yDp.OLrzqt("type", str))), new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.gbk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AbstractC20169gbn.EZpvd(iCopydefault, (java.util.List) obj2);
                }
            }, 14, null)));
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) str);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault), 0, str.length(), 17);
            listOLrzqt.add(new C57524yjz.ActionBar(new android.text.SpannedString(spannableStringBuilder)));
        }
        c57524yjz.setData(new C57524yjz.TaskDescription(C56402yEa.fARcdN(listOLrzqt), str2, obj != null ? new C57524yjz.Application(obj, null, 0, 6, null) : null, obj == null ? 1 : 0));
        return c57524yjz;
    }

    public static final Unit EZpvd(int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(i));
        return Unit.INSTANCE;
    }

    public final C57508yjj ORxRYg() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C57508yjj(contextRequireContext, null, 0, 6, null);
    }

    public static /* synthetic */ C57508yjj txAssetInfoView$default(AbstractC20169gbn abstractC20169gbn, java.lang.String str, java.lang.String str2, RiskPopupInfo.RiskPopupInfoItem riskPopupInfoItem, java.util.List list, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: txAssetInfoView");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            riskPopupInfoItem = null;
        }
        return abstractC20169gbn.KWHzl(str, str2, riskPopupInfoItem, (java.util.List<StateListAnimator>) list);
    }

    public final C57508yjj KWHzl(java.lang.String str, java.lang.String str2, RiskPopupInfo.RiskPopupInfoItem riskPopupInfoItem, @NotNull java.util.List<StateListAnimator> list) {
        Intrinsics.checkNotNullParameter(list, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57508yjj c57508yjj = new C57508yjj(contextRequireContext, null, 0, 6, null);
        KWHzl(c57508yjj, str, str2, riskPopupInfoItem, list);
        return c57508yjj;
    }

    public static /* synthetic */ void setData$default(AbstractC20169gbn abstractC20169gbn, C57508yjj c57508yjj, java.lang.String str, java.lang.String str2, RiskPopupInfo.RiskPopupInfoItem riskPopupInfoItem, java.util.List list, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setData");
        }
        abstractC20169gbn.KWHzl(c57508yjj, (i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : riskPopupInfoItem, (java.util.List<StateListAnimator>) list);
    }

    public final void KWHzl(@NotNull C57508yjj c57508yjj, java.lang.String str, java.lang.String str2, final RiskPopupInfo.RiskPopupInfoItem riskPopupInfoItem, @NotNull java.util.List<StateListAnimator> list) {
        Intrinsics.checkNotNullParameter(c57508yjj, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 1;
        if (str != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            C57512yjn.ActionBar[] actionBarArr = new C57512yjn.ActionBar[1];
            actionBarArr[0] = new C57512yjn.ActionBar(new C57512yjn.Activity(str, riskPopupInfoItem != null ? java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN)) : null, str2 == null ? "" : str2, riskPopupInfoItem != null, riskPopupInfoItem == null ? null : new Function0() { // from class: o.gbC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20169gbn.EZpvd(this.KWHzl, riskPopupInfoItem);
                }
            }), null, null, null, 14, null);
            arrayList.add(yDY.copydefault(actionBarArr));
        }
        for (StateListAnimator stateListAnimator : list) {
            if (stateListAnimator.KWHzl()) {
                arrayList.add(null);
            } else {
                java.util.List<ActionBar> listAEQbTJ = stateListAnimator.AEQbTJ();
                if (listAEQbTJ != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                    for (ActionBar actionBar : listAEQbTJ) {
                        java.lang.Object objAEQbTJ = actionBar.AEQbTJ();
                        C14726dqr c14726dqr = C14726dqr.OLrzqt;
                        android.content.Context context = c57508yjj.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        android.graphics.drawable.Drawable drawableOLrzqt = c14726dqr.OLrzqt(context);
                        java.lang.Integer numValueOf = actionBar.valueOf();
                        arrayList2.add(new C57512yjn.ActionBar(null, new C57512yjn.TaskDescription(objAEQbTJ, drawableOLrzqt, 0, numValueOf != null ? numValueOf.intValue() : C55298xhM.dp2px$default(16.0f, null, i, null), 4, null), new C57512yjn.StateListAnimator(actionBar.KWHzl(), actionBar.gEmmrt(), "", actionBar.OLrzqt(), actionBar.EZpvd() == null ? null : new C57512yjn.TaskDescription(actionBar.EZpvd(), null, 24, 0, 2, null), actionBar.AhwBna()), actionBar.copydefault()));
                        i = 1;
                    }
                    arrayList.add(arrayList2);
                }
            }
            i = 1;
        }
        int iCopydefault = C56548yJl.copydefault(arrayList.size() - 3, 0);
        c57508yjj.setData(arrayList, 3, C33069mpW.copydefault(this, C13754dXa.FragmentManager.gRtANS, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCopydefault)))), pTD.KWHzl(this, C13754dXa.Dialog.copydefault, iCopydefault, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCopydefault)))), false);
    }

    public static final Unit EZpvd(AbstractC20169gbn abstractC20169gbn, RiskPopupInfo.RiskPopupInfoItem riskPopupInfoItem) {
        androidx.fragment.app.FragmentManager parentFragmentManager = abstractC20169gbn.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.add(C13754dXa.ActionBar.DfrfUJ, fZU.Companion.copydefault(riskPopupInfoItem), (java.lang.String) null);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ C57518yjt mevView$default(AbstractC20169gbn abstractC20169gbn, boolean z, java.lang.Boolean bool, java.util.List list, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mevView");
        }
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return abstractC20169gbn.EZpvd(z, bool, (java.util.List<MevInfo.MevNode>) list);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C57518yjt EZpvd(boolean z, java.lang.Boolean bool, final java.util.List<MevInfo.MevNode> list) {
        java.lang.String strAYXKKw;
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
        return OLrzqt(strAYXKKw2, (java.lang.CharSequence) strAYXKKw, booleanRef.element ? java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)) : null, (java.lang.Object) null, (android.graphics.drawable.Drawable) null, true, new Function1() { // from class: o.gbA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20169gbn.KWHzl(booleanRef, list, this, (C57518yjt) obj);
            }
        });
    }

    public static final Unit KWHzl(final Ref.BooleanRef booleanRef, final java.util.List list, final AbstractC20169gbn abstractC20169gbn, final C57518yjt c57518yjt) {
        Intrinsics.checkNotNullParameter(c57518yjt, "");
        C20281gdt.Companion.EZpvd(booleanRef.element, list, new Function1() { // from class: o.gbu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20169gbn.KWHzl(booleanRef, c57518yjt, abstractC20169gbn, list, ((java.lang.Boolean) obj).booleanValue());
            }
        }).show(abstractC20169gbn.getChildFragmentManager(), "javaClass");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Ref.BooleanRef booleanRef, C57518yjt c57518yjt, AbstractC20169gbn abstractC20169gbn, java.util.List list, boolean z) {
        booleanRef.element = z;
        SPUtils.put("is_dapp_mev_on", java.lang.Boolean.valueOf(z));
        if (booleanRef.element) {
            c57518yjt.setInfoValue(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onAnimationEnd));
            c57518yjt.setInfoValueColor(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ));
            abstractC20169gbn.OLrzqt((java.util.List<MevInfo.MevNode>) list);
        } else {
            c57518yjt.setInfoValue(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onAnimationStart));
            c57518yjt.setInfoValueColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            abstractC20169gbn.hDKMBd();
        }
        return Unit.INSTANCE;
    }

    public final C57523yjy zuBGHE() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57523yjy c57523yjy = new C57523yjy(contextRequireContext, null, 0, 6, null);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.unregister);
        java.lang.String strDjBIcL = ejfBZ().dHguZz().djBIcL();
        java.lang.String strAYXKKw2 = ejfBZ().dHguZz().AYXKKw();
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        android.content.Context context = c57523yjy.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c57523yjy.setData(new C57523yjy.ActionBar(strAYXKKw, strDjBIcL, strAYXKKw2, c14726dqr.OLrzqt(context), false, null, null, null, null, null, 1008, null));
        return c57523yjy;
    }

    public C57516yjr djBIcL() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C57516yjr(contextRequireContext, null, 0, 6, null);
    }

    public static /* synthetic */ C57504yjf walletUsedView$default(AbstractC20169gbn abstractC20169gbn, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: walletUsedView");
        }
        if ((i & 1) != 0) {
            str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1);
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return abstractC20169gbn.OLrzqt(str, str2);
    }

    public final C57504yjf OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return addressView$default(this, str, ejfBZ().spnCvw(), null, str2 == null ? "" : str2, null, false, new Function1() { // from class: o.gbw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20169gbn.valueOf(this.copydefault, (java.lang.String) obj);
            }
        }, 52, null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction] */
    public static final Unit valueOf(AbstractC20169gbn abstractC20169gbn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC20082gaF.trackClickEvent$default(abstractC20169gbn, abstractC20169gbn.ejfBZ(), "wallet_used_address", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.gbn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C57504yjf addressView$default(AbstractC20169gbn abstractC20169gbn, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if (obj == null) {
            return abstractC20169gbn.OLrzqt(str, str2, (i & 4) != 0 ? null : num, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? false : z, (Function1<? super java.lang.String, Unit>) ((i & 64) != 0 ? null : function1));
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addressView");
    }

    public final C57504yjf OLrzqt(@NotNull java.lang.String str, @NotNull final java.lang.String str2, java.lang.Integer num, @NotNull java.lang.String str3, java.lang.String str4, boolean z, final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final C57504yjf c57504yjf = new C57504yjf(contextRequireContext, null, 0, 6, null);
        c57504yjf.setData(new C57504yjf.Activity(str, str2, str3, str4, z, new Function0() { // from class: o.gbB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20169gbn.copydefault(function1, str2, c57504yjf);
            }
        }));
        if (num != null) {
            num.intValue();
            c57504yjf.setAddressColor(num.intValue());
        }
        return c57504yjf;
    }

    public static final Unit copydefault(Function1 function1, java.lang.String str, C57504yjf c57504yjf) {
        if (function1 != null) {
            function1.invoke(str);
        }
        android.content.Context context = c57504yjf.getContext();
        java.lang.Object systemService = context != null ? context.getSystemService("clipboard") : null;
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), str).KWHzl(c57504yjf.getContext());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gbn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OKWeb3TXDataInputView dataInputView$default(AbstractC20169gbn abstractC20169gbn, DataInputModuleModel.DataInputItem dataInputItem, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dataInputView");
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        return abstractC20169gbn.AEQbTJ(dataInputItem, (Function1<? super java.lang.String, Unit>) function1);
    }

    public final OKWeb3TXDataInputView AEQbTJ(@NotNull final DataInputModuleModel.DataInputItem dataInputItem, final Function1<? super java.lang.String, Unit> function1) {
        OKWeb3TXDataInputView.HeightMode heightMode;
        OKWeb3TXDataInputView.InputType inputType;
        Intrinsics.checkNotNullParameter(dataInputItem, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        OKWeb3TXDataInputView oKWeb3TXDataInputView = new OKWeb3TXDataInputView(contextRequireContext, null, 0, 6, null);
        java.lang.String title = dataInputItem.getTitle();
        java.lang.String hint = dataInputItem.getHint();
        java.lang.String content = dataInputItem.getContent();
        if (Intrinsics.EZpvd((java.lang.Object) dataInputItem.getHeight(), (java.lang.Object) DataInputModuleModel.DataInputItem.HEIGHT_TALL)) {
            heightMode = OKWeb3TXDataInputView.HeightMode.TALL;
        } else {
            heightMode = OKWeb3TXDataInputView.HeightMode.NORMAL;
        }
        OKWeb3TXDataInputView.HeightMode heightMode2 = heightMode;
        if (Intrinsics.EZpvd((java.lang.Object) dataInputItem.getInputType(), (java.lang.Object) "text")) {
            inputType = OKWeb3TXDataInputView.InputType.TEXT;
        } else {
            inputType = OKWeb3TXDataInputView.InputType.NUMBER;
        }
        oKWeb3TXDataInputView.setData(new OKWeb3TXDataInputView.StateListAnimator(title, hint, content, heightMode2, inputType, dataInputItem.getMaxByteLength(), dataInputItem.getMaxDecimalLength(), new Function1() { // from class: o.gby
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20169gbn.OLrzqt(function1, dataInputItem, (java.lang.String) obj);
            }
        }));
        return oKWeb3TXDataInputView;
    }

    public static final Unit OLrzqt(Function1 function1, DataInputModuleModel.DataInputItem dataInputItem, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (function1 != null) {
            function1.invoke(str);
        } else {
            Function1<java.lang.String, Unit> onContentChange = dataInputItem.getOnContentChange();
            if (onContentChange != null) {
                onContentChange.invoke(str);
            }
        }
        return Unit.INSTANCE;
    }

    public final C57513yjo KWHzl(@NotNull DataShowModuleModel.DataShowItem dataShowItem) {
        Intrinsics.checkNotNullParameter(dataShowItem, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57513yjo c57513yjo = new C57513yjo(contextRequireContext, null, 0, 6, null);
        c57513yjo.setData(new C57513yjo.ActionBar(dataShowItem.getTitle(), dataShowItem.getContent(), dataShowItem.getDescText()));
        return c57513yjo;
    }

    public final C57512yjn copydefault(@NotNull java.lang.String str, java.lang.Object obj, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57512yjn c57512yjn = new C57512yjn(contextRequireContext, null, 0, false, 14, null);
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        android.content.Context context = c57512yjn.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c57512yjn.setData(new C57512yjn.ActionBar(null, new C57512yjn.TaskDescription(obj, c14726dqr.KWHzl(context), 0, 0, 12, null), new C57512yjn.StateListAnimator(str, null, null, null, null, null, 62, null), str2, 1, null));
        return c57512yjn;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gbn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C57519yju moreView$default(AbstractC20169gbn abstractC20169gbn, boolean z, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moreView");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.search);
        }
        if ((i & 4) != 0) {
            str2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRoot);
        }
        if ((i & 8) != 0) {
            list = null;
        }
        return abstractC20169gbn.copydefault(z, str, str2, (java.util.List<? extends android.view.View>) list);
    }

    public final C57519yju copydefault(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.List<? extends android.view.View> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57519yju c57519yju = new C57519yju(contextRequireContext, null, 0, 6, null);
        c57519yju.setData(new C57519yju.ActionBar(str, str2, z, new Function0() { // from class: o.gbz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20169gbn.copydefault();
            }
        }, false, 16, null));
        if (list != null && !list.isEmpty()) {
            c57519yju.setAssociatedViews(list);
        }
        return c57519yju;
    }

    public static final Unit copydefault() {
        C32866mlf.onEvent$default("app_web3_wallet_transaction_scam_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final C57518yjt AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return infoView$default(this, str, "", null, null, null, true, new Function1() { // from class: o.gbo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20169gbn.EZpvd(this.OLrzqt, str, str2, (C57518yjt) obj);
            }
        }, 28, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yjs.ActionBar.show$default(o.yjs$ActionBar, androidx.fragment.app.FragmentManager, java.lang.String, o.yjH, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int, java.lang.Object):o.yjs */
    public static final Unit EZpvd(final AbstractC20169gbn abstractC20169gbn, java.lang.String str, java.lang.String str2, C57518yjt c57518yjt) {
        Intrinsics.checkNotNullParameter(c57518yjt, "");
        C57517yjs.ActionBar actionBar = C57517yjs.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = abstractC20169gbn.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        actionBar.AEQbTJ(childFragmentManager, str, new C57476yjD(str2, null, null, false, 14, null), (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null, (24 & 32) != 0 ? null : new Function1() { // from class: o.gbl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20169gbn.djBIcL(this.KWHzl, (java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(AbstractC20169gbn abstractC20169gbn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context context = abstractC20169gbn.getContext();
        java.lang.Object systemService = context != null ? context.getSystemService("clipboard") : null;
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        java.lang.String string = abstractC20169gbn.getString(C13754dXa.FragmentManager.setProfilesSinceInitCount);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final C57518yjt OLrzqt(@NotNull final java.lang.String str, final java.util.List<TabListModuleModel.TabsItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        if (list == null || list.isEmpty()) {
            return null;
        }
        return infoView$default(this, str, pTB.formatLocalized$default(java.lang.String.valueOf(list.size()), null, 1, null), null, null, null, true, new Function1() { // from class: o.gbv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20169gbn.EZpvd(this.AEQbTJ, str, list, (C57518yjt) obj);
            }
        }, 28, null);
    }

    public static final Unit EZpvd(final AbstractC20169gbn abstractC20169gbn, java.lang.String str, java.util.List list, C57518yjt c57518yjt) {
        Intrinsics.checkNotNullParameter(c57518yjt, "");
        C57517yjs.ActionBar actionBar = C57517yjs.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = abstractC20169gbn.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            TabListModuleModel.TabsItem tabsItem = (TabListModuleModel.TabsItem) it.next();
            arrayList.add(new C57481yjI(tabsItem.getTitle(), tabsItem.getAddress(), null, tabsItem.getProjectName()));
        }
        actionBar.AEQbTJ(childFragmentManager, str, new C57477yjE(arrayList, null, null, false, 14, null), (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null, (24 & 32) != 0 ? null : new Function1() { // from class: o.gbq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20169gbn.gEmmrt(this.EZpvd, (java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(AbstractC20169gbn abstractC20169gbn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context context = abstractC20169gbn.getContext();
        java.lang.Object systemService = context != null ? context.getSystemService("clipboard") : null;
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), str).KWHzl(abstractC20169gbn.getContext());
        return Unit.INSTANCE;
    }

    public final android.view.View KWHzl(@NotNull final TxExplain txExplain) {
        Intrinsics.checkNotNullParameter(txExplain, "");
        KeyEventDispatcher.Component activity = getActivity();
        InterfaceC57493yjU interfaceC57493yjU = activity instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) activity : null;
        if (interfaceC57493yjU != null) {
            interfaceC57493yjU.OLrzqt(new Function1() { // from class: o.gbx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC20169gbn.EZpvd(this.copydefault, txExplain, (android.widget.ImageView) obj);
                }
            });
        }
        return null;
    }

    public static final Unit EZpvd(final AbstractC20169gbn abstractC20169gbn, final TxExplain txExplain, android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.v);
        Intrinsics.copydefault(drawableKWHzl);
        drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
        imageView.setImageDrawable(drawableKWHzl);
        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.gbE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC20169gbn.EZpvd(this.KWHzl, txExplain, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void EZpvd(AbstractC20169gbn abstractC20169gbn, TxExplain txExplain, android.view.View view) {
        if (abstractC20169gbn.getChildFragmentManager().isStateSaved()) {
            return;
        }
        C20505giE c20505giEEZpvd = C20505giE.Companion.EZpvd(txExplain);
        androidx.fragment.app.FragmentManager childFragmentManager = abstractC20169gbn.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c20505giEEZpvd.show(childFragmentManager);
    }

    public final C57518yjt EZpvd(@NotNull java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return infoView$default(this, str, str2, null, null, null, false, new Function1() { // from class: o.gbj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20169gbn.EZpvd(this.KWHzl, str2, (C57518yjt) obj);
            }
        }, 60, null);
    }

    public static final Unit EZpvd(AbstractC20169gbn abstractC20169gbn, java.lang.String str, C57518yjt c57518yjt) {
        Intrinsics.checkNotNullParameter(c57518yjt, "");
        java.lang.Object systemService = abstractC20169gbn.requireActivity().getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        java.lang.String string = abstractC20169gbn.getString(C13754dXa.FragmentManager.setProfilesSinceInitCount);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final C57518yjt OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, final java.util.List<? extends BaseModel<?>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return infoView$default(this, str, C14079deg.EZpvd.EZpvd(str2), null, null, null, true, new Function1() { // from class: o.gbH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20169gbn.AEQbTJ(this.KWHzl, list, (C57518yjt) obj);
            }
        }, 28, null);
    }

    public static final Unit AEQbTJ(final AbstractC20169gbn abstractC20169gbn, java.util.List list, C57518yjt c57518yjt) {
        Intrinsics.checkNotNullParameter(c57518yjt, "");
        if (!abstractC20169gbn.getParentFragmentManager().isStateSaved() && list != null) {
            C20537gik.StateListAnimator stateListAnimator = C20537gik.Companion;
            Function1<? super AbstractC20481ghh<?>, Unit> function1 = new Function1() { // from class: o.gbF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC20169gbn.OLrzqt(this.OLrzqt, (AbstractC20481ghh) obj);
                }
            };
            AbstractC20481ghh.Activity activity = AbstractC20481ghh.Companion;
            activity.KWHzl(list);
            activity.OLrzqt(function1);
            abstractC20169gbn.getParentFragmentManager().beginTransaction().hide(abstractC20169gbn).add(C13754dXa.ActionBar.DfrfUJ, new C20537gik()).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC20169gbn abstractC20169gbn, AbstractC20481ghh abstractC20481ghh) {
        Intrinsics.checkNotNullParameter(abstractC20481ghh, "");
        abstractC20169gbn.getParentFragmentManager().beginTransaction().remove(abstractC20481ghh).show(abstractC20169gbn).commitAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public final C57518yjt EZpvd(@NotNull java.lang.String str, @NotNull final java.util.List<DappBTCUTXOInfo> list, @NotNull final java.util.List<DappBTCUTXOInfo> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return infoView$default(this, str, "", null, null, null, true, new Function1() { // from class: o.gbr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20169gbn.OLrzqt(this.KWHzl, list, list2, (C57518yjt) obj);
            }
        }, 28, null);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction] */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction] */
    public static final Unit OLrzqt(final AbstractC20169gbn abstractC20169gbn, java.util.List list, java.util.List list2, C57518yjt c57518yjt) {
        Intrinsics.checkNotNullParameter(c57518yjt, "");
        if (!abstractC20169gbn.getChildFragmentManager().isStateSaved()) {
            C20507giG c20507giGAEQbTJ = C20507giG.Companion.AEQbTJ(abstractC20169gbn.ejfBZ().htlTjW(), abstractC20169gbn.ejfBZ().dHguZz().AhwBna(), list, list2);
            c20507giGAEQbTJ.OLrzqt(new Function1() { // from class: o.gbt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC20169gbn.copydefault(this.OLrzqt, (java.lang.String) obj);
                }
            });
            androidx.fragment.app.FragmentManager childFragmentManager = abstractC20169gbn.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c20507giGAEQbTJ.show(childFragmentManager);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC20169gbn abstractC20169gbn, java.lang.String str) {
        android.content.Context context = abstractC20169gbn.getContext();
        java.lang.Object systemService = context != null ? context.getSystemService("clipboard") : null;
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        java.lang.String string = abstractC20169gbn.getString(C13754dXa.FragmentManager.setProfilesSinceInitCount);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final C57505yjg EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<TransactionAddressPermissionInfoBean.AddressPermissionDataBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57505yjg c57505yjg = new C57505yjg(contextRequireContext, null, 0, 6, null);
        c57505yjg.setViewDataBean(new TransactionAddressPermissionInfoBean(str, list));
        return c57505yjg;
    }

    public final C57518yjt KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return infoView$default(this, str, str2, null, null, null, true, new Function1() { // from class: o.gbD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20169gbn.KWHzl(this.copydefault, (C57518yjt) obj);
            }
        }, 28, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(final AbstractC20169gbn abstractC20169gbn, final C57518yjt c57518yjt) {
        Intrinsics.checkNotNullParameter(c57518yjt, "");
        if (!abstractC20169gbn.getChildFragmentManager().isStateSaved()) {
            T tEjfBZ = abstractC20169gbn.ejfBZ();
            final C12149chW c12149chW = tEjfBZ instanceof C12149chW ? (C12149chW) tEjfBZ : null;
            if (c12149chW == null) {
                return Unit.INSTANCE;
            }
            C13851daQ c13851daQ = new C13851daQ();
            androidx.fragment.app.FragmentManager childFragmentManager = abstractC20169gbn.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c13851daQ.AEQbTJ(childFragmentManager, c12149chW.fHqPtx().AhwBna(), c12149chW.dmfpNf(), c12149chW.Dmq(), c12149chW.QUSxYX(), new yHO() { // from class: o.gbs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return AbstractC20169gbn.KWHzl(c12149chW, c57518yjt, abstractC20169gbn, (java.lang.String) obj, (java.lang.String) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, new Function0() { // from class: o.gbp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20169gbn.AEQbTJ();
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C12149chW c12149chW, C57518yjt c57518yjt, AbstractC20169gbn abstractC20169gbn, java.lang.String str, java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c12149chW.AEQbTJ(new WalletBtcAddressBean(str, i, C54870xYj.KWHzl(str2, c12149chW.dHguZz().valueOf()), "", c12149chW.dHguZz().fJNWhG()));
        ChainAddress chainAddressRcXXUw = c12149chW.RcXXUw();
        java.lang.String strEZpvd = null;
        java.lang.String addressTypeText = chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddressTypeText() : null;
        if (addressTypeText == null) {
            addressTypeText = "";
        }
        c57518yjt.setInfoValue(addressTypeText);
        C57518yjt c57518yjt2 = (C57518yjt) abstractC20169gbn.isConnected().AEQbTJ("available_balance");
        if (c57518yjt2 != null) {
            java.lang.String strOcIXYQ = c12149chW.OcIXYQ();
            if (strOcIXYQ != null) {
                strEZpvd = C54870xYj.EZpvd(strOcIXYQ, c12149chW.dHguZz().valueOf(), c12149chW.dHguZz().AkhnZx(), c12149chW.dHguZz().fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            }
            c57518yjt2.setInfoValue(strEZpvd != null ? strEZpvd : "");
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.gbn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C57518yjt infoView$default(AbstractC20169gbn abstractC20169gbn, java.lang.String str, java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.Object obj, android.graphics.drawable.Drawable drawable, boolean z, Function1 function1, int i, java.lang.Object obj2) {
        if (obj2 == null) {
            return abstractC20169gbn.OLrzqt(str, charSequence, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : obj, (i & 16) != 0 ? null : drawable, (i & 32) != 0 ? false : z, (Function1<? super C57518yjt, Unit>) ((i & 64) != 0 ? null : function1));
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: infoView");
    }

    public final C57518yjt OLrzqt(java.lang.String str, java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.Object obj, android.graphics.drawable.Drawable drawable, boolean z, Function1<? super C57518yjt, Unit> function1) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57518yjt c57518yjt = new C57518yjt(contextRequireContext, null, 0, 6, null);
        c57518yjt.setViewDataBean(new TransactionInfoRowBean(str, null, charSequence, num, null, null, null, false, null, null, obj, drawable, z, function1, PointerIconCompat.TYPE_ALIAS, null));
        return c57518yjt;
    }

    public final void KWHzl(@NotNull java.util.List<? extends android.view.View> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        android.animation.AnimatorSet duration = new android.animation.AnimatorSet().setDuration(600L);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(android.animation.ObjectAnimator.ofFloat((android.view.View) it.next(), "alpha", 1.0f, 0.0f, 1.0f));
        }
        duration.playTogether(arrayList);
        duration.start();
    }

    /* JADX INFO: renamed from: o.gbn$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        public final java.lang.String KWHzl;
        public final java.util.List<ActionBar> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gbn$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                list = stateListAnimator.copydefault;
            }
            return stateListAnimator.copydefault(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ActionBar> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(java.lang.String str, java.util.List<ActionBar> list) {
            return new StateListAnimator(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.KWHzl;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.util.List<ActionBar> list = this.copydefault;
            return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TXBean(txName=" + this.KWHzl + ", assetList=" + this.copydefault + ")";
        }

        public StateListAnimator(java.lang.String str, java.util.List<ActionBar> list) {
            this.KWHzl = str;
            this.copydefault = list;
        }

        public final boolean KWHzl() {
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) AssetDiffModuleModel.AssetDiff.segmentation);
        }
    }

    /* JADX INFO: renamed from: o.gbn$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.Object copydefault;
        public final java.lang.Integer djBIcL;
        public final Function0<Unit> gEmmrt;
        public final java.lang.Object valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.lang.Object obj, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.Object obj2, Function0<Unit> function0, java.lang.String str5, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new ActionBar(obj, str, str2, str3, str4, obj2, function0, str5, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) actionBar.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd(this.valueOf, actionBar.valueOf) && Intrinsics.EZpvd(this.gEmmrt, actionBar.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd(this.djBIcL, actionBar.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            int iHashCode3 = this.AYXKKw.hashCode();
            int iHashCode4 = this.EZpvd.hashCode();
            int iHashCode5 = this.OLrzqt.hashCode();
            java.lang.Object obj = this.valueOf;
            int iHashCode6 = obj == null ? 0 : obj.hashCode();
            Function0<Unit> function0 = this.gEmmrt;
            int iHashCode7 = function0 == null ? 0 : function0.hashCode();
            java.lang.String str = this.KWHzl;
            int iHashCode8 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.djBIcL;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TXAssetItemBean(coinIcon=" + this.copydefault + ", amount=" + this.AEQbTJ + ", symbol=" + this.AYXKKw + ", coinTag=" + this.EZpvd + ", ccyAmount=" + this.OLrzqt + ", opIcon=" + this.valueOf + ", opIconClickCallback=" + this.gEmmrt + ", expirationTime=" + this.KWHzl + ", roundedRadius=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer valueOf() {
            return this.djBIcL;
        }

        public ActionBar(@NotNull java.lang.Object obj, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.Object obj2, Function0<Unit> function0, java.lang.String str5, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.copydefault = obj;
            this.AEQbTJ = str;
            this.AYXKKw = str2;
            this.EZpvd = str3;
            this.OLrzqt = str4;
            this.valueOf = obj2;
            this.gEmmrt = function0;
            this.KWHzl = str5;
            this.djBIcL = num;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.gbn<T extends com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AwvSrB() {
        isConnected().copydefault();
        AEQbTJ((AbstractC20082gaF<T>.ActionBar) isConnected(), false);
    }

    private final void QOLQEE() {
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
