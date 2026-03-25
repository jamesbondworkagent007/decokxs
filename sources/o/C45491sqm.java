package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sqm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45491sqm extends AbstractC45421spV {
    public final java.lang.String AYXKKw = "UI Testing";
    public final int gEmmrt = C47315tni.ActionBar.AubY;
    public AbstractC47371tol valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC45451spz
    public java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    /* JADX INFO: renamed from: o.sqm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sqm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C45491sqm OLrzqt() {
            return new C45491sqm();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47371tol abstractC47371tolKWHzl = AbstractC47371tol.KWHzl(layoutInflater, viewGroup, false);
        this.valueOf = abstractC47371tolKWHzl;
        if (abstractC47371tolKWHzl == null) {
            Intrinsics.gEmmrt("");
            abstractC47371tolKWHzl = null;
        }
        android.view.View root = abstractC47371tolKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47371tol abstractC47371tol = this.valueOf;
        if (abstractC47371tol == null) {
            Intrinsics.gEmmrt("");
            abstractC47371tol = null;
        }
        android.widget.TextView textView = abstractC47371tol.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55133xeG.showHTML$default(textView, "<div><h1>Rich header 1</h1><h2>Rich header 2</h2><h3>Rich header 3</h3><h4>Rich header 4</h4><h5>Rich header 5</h5><p>how to test this \n<b>feaure </b>with line break</p><p>this has <a href=\"https://okg.com\">link</a></p><p>Bullets</p><ul><li><p>point 1</p></li><li><p>point 2</p></li></ul><p>Numberic</p><ol><li><p>number 1</p></li><li><p>number 2</p></li></ol><p></p></div>", null, 2, null);
        view.post(new java.lang.Runnable() { // from class: o.sqj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45491sqm.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(C45491sqm c45491sqm) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45491sqm, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
