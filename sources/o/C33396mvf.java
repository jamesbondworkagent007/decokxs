package o;

import com.okinc.core.ok_app.ModeManager;
import com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerActivity;
import com.okinc.core.ok_app.homepage.pro.MainActivity;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33244msm;
import o.C33123mqX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33396mvf {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC47278tmy AEQbTJ;

    public C33396mvf(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.AEQbTJ = interfaceC47278tmy;
    }

    /* JADX INFO: renamed from: o.mvf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mvf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.Class<?> OLrzqt(AbstractC33244msm abstractC33244msm) {
        InterfaceC33207msB interfaceC33207msB;
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.PendingIntent.KWHzl)) {
            java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33207msB.class));
            if (listKWHzl != null && (interfaceC33207msB = (InterfaceC33207msB) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) != null) {
                return interfaceC33207msB.copydefault();
            }
        } else {
            if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.TaskDescription.KWHzl) || Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Application.KWHzl)) {
                return MainActivity.class;
            }
            if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Activity.KWHzl) || Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Fragment.KWHzl) || Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.ActionBar.KWHzl)) {
                return OKLiteMainContainerActivity.class;
            }
        }
        return null;
    }

    public final boolean copydefault(@NotNull final android.content.Context context, @NotNull final AbstractC33244msm abstractC33244msm, @NotNull final AbstractC33244msm abstractC33244msm2, boolean z, @NotNull final C33123mqX.Activity activity, android.os.Bundle bundle, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        ModeManager.TargetActivity targetActivity;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        Intrinsics.checkNotNullParameter(abstractC33244msm2, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : bundle;
        boolean z2 = Intrinsics.EZpvd(abstractC33244msm, abstractC33244msm2) ? false : z;
        if (Intrinsics.EZpvd(abstractC33244msm2, AbstractC33244msm.PendingIntent.KWHzl)) {
            targetActivity = ModeManager.TargetActivity.Wallet.AEQbTJ;
        } else if (Intrinsics.EZpvd(abstractC33244msm2, AbstractC33244msm.TaskDescription.KWHzl)) {
            bundle2.putInt("app_mode", 5);
            targetActivity = ModeManager.TargetActivity.Pro.EZpvd;
        } else if (Intrinsics.EZpvd(abstractC33244msm2, AbstractC33244msm.Application.KWHzl)) {
            bundle2.putInt("app_mode", 1);
            targetActivity = ModeManager.TargetActivity.Pro.EZpvd;
        } else if (Intrinsics.EZpvd(abstractC33244msm2, AbstractC33244msm.Activity.KWHzl) || Intrinsics.EZpvd(abstractC33244msm2, AbstractC33244msm.Fragment.KWHzl) || Intrinsics.EZpvd(abstractC33244msm2, AbstractC33244msm.ActionBar.KWHzl)) {
            targetActivity = ModeManager.TargetActivity.Lite.copydefault;
        } else {
            pUU.copydefault("ModeActivityRouter", "openModeMainActivity: Unknown mode " + abstractC33244msm2);
            function1.invoke(java.lang.Boolean.FALSE);
            return false;
        }
        final ModeManager.TargetActivity targetActivity2 = targetActivity;
        ModeManager.EZpvd.KWHzl(context, z2, new Function1() { // from class: o.mvj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33396mvf.EZpvd(context, targetActivity2, bundle2, function1, this, abstractC33244msm, abstractC33244msm2, activity, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return true;
    }

    public static final Unit EZpvd(android.content.Context context, ModeManager.TargetActivity targetActivity, android.os.Bundle bundle, Function1 function1, C33396mvf c33396mvf, AbstractC33244msm abstractC33244msm, AbstractC33244msm abstractC33244msm2, C33123mqX.Activity activity, boolean z) {
        ModeManager.EZpvd.EZpvd(context, z, targetActivity, bundle);
        function1.invoke(java.lang.Boolean.TRUE);
        c33396mvf.copydefault(context, abstractC33244msm, abstractC33244msm2, activity);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull AbstractC33244msm abstractC33244msm, @NotNull AbstractC33244msm abstractC33244msm2, @NotNull C33123mqX.Activity activity) {
        java.lang.String name;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        Intrinsics.checkNotNullParameter(abstractC33244msm2, "");
        Intrinsics.checkNotNullParameter(activity, "");
        java.lang.Class<?> clsOLrzqt = OLrzqt(abstractC33244msm);
        java.lang.String name2 = clsOLrzqt != null ? clsOLrzqt.getName() : null;
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
        InterfaceC33254msw interfaceC33254msw = listKWHzl != null ? (InterfaceC33254msw) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl) : null;
        if (interfaceC33254msw != null && interfaceC33254msw.EZpvd()) {
            name = interfaceC33254msw.AEQbTJ();
        } else {
            java.lang.Class<?> clsOLrzqt2 = OLrzqt(abstractC33244msm2);
            name = clsOLrzqt2 != null ? clsOLrzqt2.getName() : null;
        }
        if (name == null || !Intrinsics.EZpvd((java.lang.Object) name2, (java.lang.Object) name)) {
            if (Intrinsics.EZpvd(activity, C33123mqX.Activity.Application.KWHzl)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(C32979mnm.EZpvd.KWHzl());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    android.app.Activity activity2 = (android.app.Activity) ((WeakReference) arrayList.get(i)).get();
                    if (!Intrinsics.EZpvd((java.lang.Object) name, (java.lang.Object) (activity2 != null ? activity2.getClass().getName() : null)) && !(activity2 instanceof InterfaceC33170mrR) && activity2 != null) {
                        activity2.finish();
                    }
                }
                return;
            }
            if (Intrinsics.EZpvd(activity, C33123mqX.Activity.C0884Activity.KWHzl)) {
                if (context instanceof android.app.Activity) {
                    ((android.app.Activity) context).finish();
                }
            } else if (!Intrinsics.EZpvd(activity, C33123mqX.Activity.StateListAnimator.OLrzqt)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void EZpvd(@NotNull android.content.Context context, android.os.Bundle bundle) {
        InterfaceC33254msw interfaceC33254msw;
        Intrinsics.checkNotNullParameter(context, "");
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
        if (listKWHzl != null && (interfaceC33254msw = (InterfaceC33254msw) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) != null) {
            interfaceC33254msw.OLrzqt(context);
        }
        ModeManager.EZpvd.copydefault(context, bundle);
    }

    public final void EZpvd(@NotNull AbstractC33244msm abstractC33244msm, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.PendingIntent.KWHzl)) {
            ModeManager.EZpvd.wlaJM();
        } else {
            ModeManager.EZpvd.EZpvd(C33102mqC.copydefault(abstractC33244msm));
        }
        if (z) {
            AbstractC33249msr abstractC33249msrEZpvd = C33250mss.EZpvd(abstractC33244msm);
            if (abstractC33249msrEZpvd != null) {
                C33451mwh.Companion.OLrzqt().KWHzl(abstractC33249msrEZpvd, str);
                return;
            }
            return;
        }
        AbstractC33240msi abstractC33240msiCopydefault = C33239msh.copydefault(abstractC33244msm);
        if (abstractC33240msiCopydefault != null) {
            C33447mwd.Companion.EZpvd().OLrzqt(abstractC33240msiCopydefault, str);
        }
    }
}
