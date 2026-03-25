package o;

import com.okinc.dynamicfeature.manage.FeatureException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C34717nhc;
import o.C34733nhs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34729nho {
    public static final void EZpvd(@NotNull java.lang.String str, @NotNull AbstractC34718nhd abstractC34718nhd, @NotNull Function1<? super AbstractC34734nhv, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC34718nhd, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C34733nhs.ActionBar actionBar = C34733nhs.Companion;
        C34733nhs.StateListAnimator stateListAnimatorKWHzl = actionBar.KWHzl();
        if (stateListAnimatorKWHzl != null) {
            stateListAnimatorKWHzl.KWHzl();
        }
        C34733nhs.StateListAnimator stateListAnimatorKWHzl2 = actionBar.KWHzl();
        if (stateListAnimatorKWHzl2 != null) {
            stateListAnimatorKWHzl2.EZpvd("DynamicFeatureManager", "ensure module: " + str);
        }
        java.util.List<java.lang.String> listCopydefault = copydefault();
        C34733nhs.StateListAnimator stateListAnimatorKWHzl3 = actionBar.KWHzl();
        if (stateListAnimatorKWHzl3 != null) {
            stateListAnimatorKWHzl3.EZpvd("DynamicFeatureManager", "dynamicFeatures: " + listCopydefault);
        }
        if (!listCopydefault.contains(str)) {
            abstractC34718nhd.AEQbTJ();
        } else {
            function1.invoke(new Application(str, abstractC34718nhd));
        }
    }

    /* JADX INFO: renamed from: o.nho$Application */
    public static final class Application extends AbstractC34734nhv {
        public final /* synthetic */ AbstractC34718nhd AEQbTJ;
        public final /* synthetic */ java.lang.String copydefault;

        public Application(java.lang.String str, AbstractC34718nhd abstractC34718nhd) {
            this.copydefault = str;
            this.AEQbTJ = abstractC34718nhd;
        }

        @Override // o.AbstractC34734nhv
        public void EZpvd() {
            if (C34731nhq.copydefault.AEQbTJ(this.copydefault)) {
                C34717nhc.StateListAnimator stateListAnimatorCopydefault = C34717nhc.Companion.copydefault();
                if (stateListAnimatorCopydefault != null) {
                    stateListAnimatorCopydefault.getPostValueLengthLimit();
                }
                this.AEQbTJ.AEQbTJ();
                return;
            }
            EZpvd(new FeatureException(1, "Module register failed"));
        }

        @Override // o.AbstractC34734nhv
        public void EZpvd(java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            C34733nhs.ActionBar actionBar = C34733nhs.Companion;
            C34733nhs.Application applicationOLrzqt = actionBar.OLrzqt();
            if (applicationOLrzqt == null || !applicationOLrzqt.copydefault(exc)) {
                this.AEQbTJ.copydefault(exc, actionBar.EZpvd().EZpvd(exc));
            }
        }

        @Override // o.AbstractC34734nhv
        public void OLrzqt(int i) {
            this.AEQbTJ.AEQbTJ(i);
        }

        @Override // o.AbstractC34734nhv
        public void AEQbTJ() {
            this.AEQbTJ.copydefault();
        }
    }

    public static final java.util.List<java.lang.String> copydefault() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("com.okinc.dynamicfeature.DynamicConfig").getDeclaredField("DYNAMIC_FEATURES");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(null);
            Intrinsics.copydefault(obj, "");
            C56406yEe.KWHzl(arrayList, (java.lang.String[]) obj);
        } catch (java.lang.Exception e) {
            C34733nhs.StateListAnimator stateListAnimatorKWHzl = C34733nhs.Companion.KWHzl();
            if (stateListAnimatorKWHzl != null) {
                stateListAnimatorKWHzl.AEQbTJ("DynamicFeatureManager", "read DynamicConfig error", e);
            }
        }
        return arrayList;
    }
}
