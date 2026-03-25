package o;

import com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web3Uilib.bean.InputsAndOutputsBean;
import com.okinc.web3Uilib.bean.TransferAssetInfoBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.geT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20308geT extends C20446ggz<C12207cib> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int fARcdN = 8;
    public C57464yis getNewProxyInstance;
    public C57438yiS uzCIH;

    /* JADX INFO: renamed from: o.geT$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.geT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C20308geT copydefault(android.os.Bundle bundle) {
            C20308geT c20308geT = new C20308geT();
            c20308geT.setArguments(bundle);
            return c20308geT;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20446ggz
    public TransferAssetInfoBean QVAiDq() {
        C10854bwM c10854bwMFHqPtx = ((C12207cib) ejfBZ()).fHqPtx();
        ((C12207cib) ejfBZ()).b_(((C12207cib) ejfBZ()).values(((C12207cib) ejfBZ()).Ufzxmz()));
        return new TransferAssetInfoBean(null, null, 0, 2, C54870xYj.EZpvd(((C12207cib) ejfBZ()).Ufzxmz(), c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.DTwDnp(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), c10854bwMFHqPtx.fJNWhG(), c10854bwMFHqPtx.dNCPSb(), ((C12207cib) ejfBZ()).EZpvd(true), null, false, 775, null);
    }

    @Override // o.C20446ggz
    public C57464yis QUSxYX() {
        C57464yis c57464yisAEQbTJ = AEQbTJ(true, C33070mpX.AYXKKw(C13754dXa.FragmentManager.hQkvHM), new Function1() { // from class: o.geX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20308geT.copydefault(this.EZpvd, (AbstractC20082gaF.ActionBar) obj);
            }
        });
        this.getNewProxyInstance = c57464yisAEQbTJ;
        return c57464yisAEQbTJ;
    }

    public static final Unit copydefault(C20308geT c20308geT, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.OLrzqt(c20308geT.QbewEr());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.ggz.QbewEr()Lo/eUI; */
    public final C57438yiS QbewEr() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57438yiS c57438yiS = new C57438yiS(contextRequireContext, null, 0, 6, null);
        this.uzCIH = c57438yiS;
        UeEOUB();
        return c57438yiS;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void UeEOUB() {
        java.lang.String strCopydefault;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = null;
        OkUTXOTransaction.InputsAndOutputs inputsAndOutputs$default = C12207cib.getInputsAndOutputs$default((C12207cib) ejfBZ(), false, 1, null);
        C57438yiS c57438yiS = this.uzCIH;
        if (c57438yiS != null) {
            java.lang.String strCopydefault2 = "";
            if (C33129mqd.KWHzl((java.util.Collection) inputsAndOutputs$default.getInputs())) {
                int i = C13754dXa.FragmentManager.arDRxL;
                java.util.List<OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean> inputs = inputsAndOutputs$default.getInputs();
                strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C33129mqd.gEmmrt(inputs != null ? java.lang.Integer.valueOf(inputs.size()) : null))));
            } else {
                strCopydefault = "";
            }
            java.util.List<OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean> inputs2 = inputsAndOutputs$default.getInputs();
            if (inputs2 != null) {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(inputs2, 10));
                for (OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean uTXOSimpleBean : inputs2) {
                    arrayList.add(new InputsAndOutputsBean.SimpleBean(uTXOSimpleBean.getAddress(), uTXOSimpleBean.getAmount(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.createOverrideConfigurationForDayNight)));
                }
            } else {
                arrayList = null;
            }
            if (C33129mqd.KWHzl((java.util.Collection) inputsAndOutputs$default.getOutputs())) {
                int i2 = C13754dXa.FragmentManager.ddauOi;
                java.util.List<OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean> outputs = inputsAndOutputs$default.getOutputs();
                strCopydefault2 = C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C33129mqd.gEmmrt(outputs != null ? java.lang.Integer.valueOf(outputs.size()) : null))));
            }
            java.util.List<OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean> outputs2 = inputsAndOutputs$default.getOutputs();
            if (outputs2 != null) {
                arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(outputs2, 10));
                for (OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean uTXOSimpleBean2 : outputs2) {
                    arrayList2.add(new InputsAndOutputsBean.SimpleBean(uTXOSimpleBean2.getAddress(), uTXOSimpleBean2.getAmount(), (java.lang.String) null, 4, (DefaultConstructorMarker) null));
                }
            }
            c57438yiS.setViewDataBean(new InputsAndOutputsBean(strCopydefault, strCopydefault2, arrayList, arrayList2));
        }
    }

    @Override // o.C20446ggz, o.AbstractC20080gaD
    public void KWHzl(@NotNull AbstractC8426bCW<?> abstractC8426bCW, @NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(abstractC8426bCW, "");
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        super.KWHzl(abstractC8426bCW, c8486bDd);
        UeEOUB();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    @Override // o.C20446ggz, o.AbstractC20080gaD, o.AbstractC20082gaF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        super.copydefault(collection);
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
        int i = 0;
        OkUTXOTransaction.InputsAndOutputs inputsAndOutputs$default = ((abstractC9832bcy instanceof C9784bcC) || (abstractC9832bcy instanceof C9811bcd)) ? null : C12207cib.getInputsAndOutputs$default((C12207cib) ejfBZ(), false, 1, null);
        C57464yis c57464yis = this.getNewProxyInstance;
        if (c57464yis != null) {
            if (C33129mqd.KWHzl((java.util.Collection) (inputsAndOutputs$default != null ? inputsAndOutputs$default.getInputs() : null))) {
                if (!C33129mqd.KWHzl((java.util.Collection) (inputsAndOutputs$default != null ? inputsAndOutputs$default.getOutputs() : null))) {
                }
            } else {
                i = 8;
            }
            c57464yis.setVisibility(i);
        }
    }
}
