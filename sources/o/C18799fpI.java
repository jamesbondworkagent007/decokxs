package o;

import androidx.autofill.HintConstants;
import com.okinc.business.defi.biz.drivers.bean.HDWalletCloudBackupBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC14457dln;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18799fpI implements InterfaceC18801fpK {
    public java.lang.Integer AEQbTJ;
    public HDWalletCloudBackupBean EZpvd;
    public Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> KWHzl;
    public final AbstractActivityC33041mov OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.Integer num) {
        this.AEQbTJ = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(HDWalletCloudBackupBean hDWalletCloudBackupBean) {
        this.EZpvd = hDWalletCloudBackupBean;
    }

    public C18799fpI(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.OLrzqt = abstractActivityC33041mov;
        this.copydefault = 100;
        this.AEQbTJ = 1;
    }

    @Override // o.InterfaceC18801fpK
    public void EZpvd(@NotNull final java.lang.String str, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        HDWalletCloudBackupBean hDWalletCloudBackupBean = this.EZpvd;
        Intrinsics.copydefault(hDWalletCloudBackupBean);
        if (c14392dkb.copydefault(str, hDWalletCloudBackupBean)) {
            function1.invoke(java.lang.Boolean.TRUE);
            androidx.fragment.app.FragmentManager supportFragmentManager = this.OLrzqt.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            AbstractActivityC33041mov abstractActivityC33041mov = this.OLrzqt;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("from", "icloud");
            bundle.putInt("requestCode", this.copydefault);
            Unit unit = Unit.INSTANCE;
            new C14469dlz(supportFragmentManager, abstractActivityC33041mov, bundle, null, new Function1() { // from class: o.fpF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18799fpI.OLrzqt(this.OLrzqt, str, (java.lang.String) obj);
                }
            }, null, new Function0() { // from class: o.fpE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C18799fpI.AEQbTJ(this.OLrzqt, str);
                }
            }, new Function1() { // from class: o.fpN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18799fpI.AEQbTJ(this.KWHzl, str, (android.content.Intent) obj);
                }
            }, 40, null).EZpvd();
            return;
        }
        function1.invoke(java.lang.Boolean.FALSE);
    }

    public static final Unit OLrzqt(C18799fpI c18799fpI, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        HDWalletCloudBackupBean hDWalletCloudBackupBean = c18799fpI.EZpvd;
        Intrinsics.copydefault(hDWalletCloudBackupBean);
        c18799fpI.KWHzl(str, str2, hDWalletCloudBackupBean);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C18799fpI c18799fpI, java.lang.String str) {
        Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2 = c18799fpI.KWHzl;
        if (function2 != null) {
            function2.invoke(java.lang.Boolean.FALSE, str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C18799fpI c18799fpI, java.lang.String str, android.content.Intent intent) {
        if (intent == null) {
            return Unit.INSTANCE;
        }
        java.lang.String stringExtra = intent.getStringExtra(HintConstants.AUTOFILL_HINT_PASSWORD);
        if (stringExtra == null) {
            return Unit.INSTANCE;
        }
        HDWalletCloudBackupBean hDWalletCloudBackupBean = c18799fpI.EZpvd;
        Intrinsics.copydefault(hDWalletCloudBackupBean);
        c18799fpI.KWHzl(str, stringExtra, hDWalletCloudBackupBean);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final java.lang.String str, java.lang.String str2, HDWalletCloudBackupBean hDWalletCloudBackupBean) {
        this.OLrzqt.showLoadingAtOnceCannotCancel();
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        AbstractActivityC33041mov abstractActivityC33041mov = this.OLrzqt;
        Activity activity = new Activity();
        java.lang.Integer num = this.AEQbTJ;
        c14392dkb.AEQbTJ(abstractActivityC33041mov, str, str2, hDWalletCloudBackupBean, null, activity, num != null ? num.intValue() : 1, new Function2() { // from class: o.fpM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C18799fpI.KWHzl(this.copydefault, str, (AbstractC12782ctV) obj, (java.lang.String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: o.fpI$Activity */
    public static final class Activity implements InterfaceC14457dln {
        @Override // o.InterfaceC14457dln
        public boolean OLrzqt() {
            return InterfaceC14457dln.Activity.OLrzqt(this);
        }

        @Override // o.InterfaceC14457dln
        public void EZpvd(boolean z, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.copydefault("execute execute");
        }
    }

    public static final Unit KWHzl(C18799fpI c18799fpI, java.lang.String str, AbstractC12782ctV abstractC12782ctV, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (abstractC12782ctV != null) {
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivityExternalSyntheticLambda3), 0, 1, (java.lang.Object) null);
            Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2 = c18799fpI.KWHzl;
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.TRUE, str);
            }
        } else {
            c18799fpI.OLrzqt.dismissLoading();
            if (str2.length() == 0) {
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MenuRes), 0, 1, (java.lang.Object) null);
            } else {
                C55326xho.toastWithFailedIcon$default(str2, 0, 1, (java.lang.Object) null);
            }
            Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function22 = c18799fpI.KWHzl;
            if (function22 != null) {
                function22.invoke(java.lang.Boolean.FALSE, "");
            }
        }
        return Unit.INSTANCE;
    }
}
