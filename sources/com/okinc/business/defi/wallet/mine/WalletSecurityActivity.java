package com.okinc.business.defi.wallet.mine;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.ColorRes;
import com.okinc.business.defi.wallet.mine.WalletSecurityActivity;
import com.okinc.components.track.TrackChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33013moT;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.ActivityC18484fjK;
import o.ActivityC18551fkY;
import o.ActivityC18590flK;
import o.C11010bzJ;
import o.C11607cUn;
import o.C12827cuN;
import o.C13754dXa;
import o.C14471dmA;
import o.C16409ejQ;
import o.C18806fpP;
import o.C18808fpR;
import o.C32866mlf;
import o.C33064mpR;
import o.C43316rmw;
import o.C52761wXj;
import o.C56392yDr;
import o.C56444yFp;
import o.C58156yvv;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.pUU;
import o.rVN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSecurityActivity extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public C16409ejQ AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.fmx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return WalletSecurityActivity.copydefault(this.AEQbTJ);
        }
    });

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DefiWalletSecurityBean.SecurityContentType.values().length];
            try {
                iArr[DefiWalletSecurityBean.SecurityContentType.WalletPasswordSecurity.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DefiWalletSecurityBean.SecurityContentType.ChangeWalletPassword.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DefiWalletSecurityBean.SecurityContentType.WalletReset.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    private final C43316rmw EZpvd() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    public static final C43316rmw copydefault(final WalletSecurityActivity walletSecurityActivity) {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(DefiWalletSecurityBean.TaskDescription.class, new C18806fpP());
        c43316rmw.register(DefiWalletSecurityBean.Application.class, new C18808fpR(new Function1() { // from class: o.fms
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletSecurityActivity.EZpvd(this.KWHzl, (WalletSecurityActivity.DefiWalletSecurityBean.SecurityContentType) obj);
            }
        }));
        return c43316rmw;
    }

    public static final Unit EZpvd(WalletSecurityActivity walletSecurityActivity, DefiWalletSecurityBean.SecurityContentType securityContentType) {
        Intrinsics.checkNotNullParameter(securityContentType, "");
        int i = ActionBar.AEQbTJ[securityContentType.ordinal()];
        if (i == 1) {
            ActivityC18551fkY.Companion.copydefault(walletSecurityActivity);
        } else if (i == 2) {
            ActivityC18590flK.Companion.EZpvd(walletSecurityActivity);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            walletSecurityActivity.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.WalletSecurityActivity.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new Intent(context, (Class<?>) WalletSecurityActivity.class));
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.AEQbTJ = C16409ejQ.KWHzl(getLayoutInflater());
        C16409ejQ c16409ejQ = null;
        C32866mlf.onEvent$default("Web3WalletSetting_Top_Password_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
        C16409ejQ c16409ejQ2 = this.AEQbTJ;
        if (c16409ejQ2 == null) {
            Intrinsics.gEmmrt("");
            c16409ejQ2 = null;
        }
        c16409ejQ2.EZpvd.setAdapter(EZpvd());
        C16409ejQ c16409ejQ3 = this.AEQbTJ;
        if (c16409ejQ3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16409ejQ = c16409ejQ3;
        }
        setContentView(c16409ejQ.getRoot());
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        copydefault();
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault() {
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).EZpvd(), this);
        final Function1 function1 = new Function1() { // from class: o.fmB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletSecurityActivity.OLrzqt(this.OLrzqt, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fmC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletSecurityActivity.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fmE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletSecurityActivity.KWHzl(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fmD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletSecurityActivity.AhwBna(function12, obj);
            }
        }));
    }

    public static final Unit OLrzqt(WalletSecurityActivity walletSecurityActivity, Boolean bool) {
        Intrinsics.copydefault(bool);
        walletSecurityActivity.KWHzl(bool.booleanValue());
        walletSecurityActivity.dismissLoading();
        rVN.reportFullyDrawn$default((android.app.Activity) walletSecurityActivity, true, (String) null, 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(WalletSecurityActivity walletSecurityActivity, Throwable th) {
        walletSecurityActivity.dismissLoading();
        pUU.copydefault(walletSecurityActivity.getTAG(), "handleViewData error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z) {
        ArrayList<DefiWalletSecurityBean> arrayList = new ArrayList<>();
        if (z) {
            EZpvd(arrayList);
            arrayList.add(new DefiWalletSecurityBean.TaskDescription(0, 1, null));
        }
        String string = getString(C13754dXa.FragmentManager.HJWChPfrwjPh);
        Intrinsics.checkNotNullExpressionValue(string, "");
        arrayList.add(new DefiWalletSecurityBean.Application(string, "", "", DefiWalletSecurityBean.SecurityContentType.WalletReset));
        C33064mpR.OLrzqt(EZpvd(), (List<? extends Object>) arrayList);
    }

    public final void EZpvd(ArrayList<DefiWalletSecurityBean> arrayList) {
        C14471dmA c14471dmA = C14471dmA.EZpvd;
        if (!c14471dmA.EZpvd(this)) {
            String string = getString(C13754dXa.FragmentManager.setLocationManually);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = getString(C13754dXa.FragmentManager.HJWChPURsaBn);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arrayList.add(new DefiWalletSecurityBean.Application(string, "", string2, DefiWalletSecurityBean.SecurityContentType.ChangeWalletPassword));
            return;
        }
        boolean zCopydefault = c14471dmA.copydefault();
        String string3 = getString(C13754dXa.FragmentManager.setContentDescription);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getString(C13754dXa.FragmentManager.ActionBarTab);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        String string5 = getString(zCopydefault ? C13754dXa.FragmentManager.ITrustedWebActivityCallbackDefault : C13754dXa.FragmentManager.hide);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        arrayList.add(new DefiWalletSecurityBean.Application(string3, string4, string5, DefiWalletSecurityBean.SecurityContentType.WalletPasswordSecurity));
        if (zCopydefault) {
            return;
        }
        String string6 = getString(C13754dXa.FragmentManager.IResultReceiver2StubProxy);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        arrayList.add(new DefiWalletSecurityBean.Application(string6, "", "", DefiWalletSecurityBean.SecurityContentType.ChangeWalletPassword));
    }

    private final void AEQbTJ() {
        showLoading();
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.fmy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletSecurityActivity.KWHzl((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.fmw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletSecurityActivity.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
        final Function1 function12 = new Function1() { // from class: o.fmv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletSecurityActivity.AEQbTJ(this.KWHzl, (java.util.ArrayList) obj);
            }
        };
        addDisposable(abstractC58260yxtValueOf.copydefault(new InterfaceC58227yxM() { // from class: o.fmz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletSecurityActivity.AYXKKw(function12, obj);
            }
        }));
    }

    public static final ArrayList KWHzl(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ArrayList) function1.invoke(obj);
    }

    public static final ArrayList KWHzl(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
            if (!abstractC12782ctV.zLjUOn()) {
                arrayList.add(abstractC12782ctV);
            }
        }
        return arrayList;
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(WalletSecurityActivity walletSecurityActivity, ArrayList arrayList) {
        walletSecurityActivity.dismissLoading();
        if (arrayList.isEmpty()) {
            ActivityC18484fjK.StateListAnimator.startActivity$default(ActivityC18484fjK.Companion, walletSecurityActivity, 3, null, 4, null);
        } else {
            ActivityC18484fjK.StateListAnimator.startActivity$default(ActivityC18484fjK.Companion, walletSecurityActivity, 2, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public interface DefiWalletSecurityBean {

        public static final class TaskDescription implements DefiWalletSecurityBean {
            public final int AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription() {
                this(0, 1, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = taskDescription.AEQbTJ;
                }
                return taskDescription.OLrzqt(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(@ColorRes int i) {
                return new TaskDescription(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && this.AEQbTJ == ((TaskDescription) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Integer.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "WalletSecurityLineBean(color=" + this.AEQbTJ + ")";
            }

            public TaskDescription(@ColorRes int i) {
                this.AEQbTJ = i;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.Activity.sZqaRl int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:182) call: com.okinc.business.defi.wallet.mine.WalletSecurityActivity.DefiWalletSecurityBean.TaskDescription.<init>(int):void type: THIS */
            public /* synthetic */ TaskDescription(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? C52761wXj.Activity.sZqaRl : i);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class SecurityContentType {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ SecurityContentType[] $VALUES;
            public static final SecurityContentType WalletPasswordSecurity = new SecurityContentType("WalletPasswordSecurity", 0);
            public static final SecurityContentType ChangeWalletPassword = new SecurityContentType("ChangeWalletPassword", 1);
            public static final SecurityContentType WalletReset = new SecurityContentType("WalletReset", 2);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ SecurityContentType[] $values() {
                return new SecurityContentType[]{WalletPasswordSecurity, ChangeWalletPassword, WalletReset};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<SecurityContentType> getEntries() {
                return $ENTRIES;
            }

            private SecurityContentType(String str, int i) {
            }

            static {
                SecurityContentType[] securityContentTypeArr$values = $values();
                $VALUES = securityContentTypeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(securityContentTypeArr$values);
            }

            public static SecurityContentType valueOf(String str) {
                return (SecurityContentType) Enum.valueOf(SecurityContentType.class, str);
            }

            public static SecurityContentType[] values() {
                return (SecurityContentType[]) $VALUES.clone();
            }
        }

        public static final class Application implements DefiWalletSecurityBean {
            public final String EZpvd;
            public final String KWHzl;
            public final String OLrzqt;
            public final SecurityContentType copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, String str2, String str3, SecurityContentType securityContentType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.KWHzl;
                }
                if ((i & 2) != 0) {
                    str2 = application.OLrzqt;
                }
                if ((i & 4) != 0) {
                    str3 = application.EZpvd;
                }
                if ((i & 8) != 0) {
                    securityContentType = application.copydefault;
                }
                return application.OLrzqt(str, str2, str3, securityContentType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SecurityContentType EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull SecurityContentType securityContentType) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(securityContentType, "");
                return new Application(str, str2, str3, securityContentType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd((Object) this.KWHzl, (Object) application.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) application.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) application.EZpvd) && this.copydefault == application.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "WalletSecurityContentBean(title=" + this.KWHzl + ", content=" + this.OLrzqt + ", tipContent=" + this.EZpvd + ", type=" + this.copydefault + ")";
            }

            public Application(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull SecurityContentType securityContentType) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(securityContentType, "");
                this.KWHzl = str;
                this.OLrzqt = str2;
                this.EZpvd = str3;
                this.copydefault = securityContentType;
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
