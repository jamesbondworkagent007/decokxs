package o;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.uilab.search.OKSearchBarFragment$dismiss$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xfA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55180xfA extends androidx.fragment.app.Fragment {
    public Function0<Unit> AEQbTJ;
    public android.view.View AhwBna;
    public java.lang.CharSequence AkhnZx;
    public java.lang.CharSequence EZpvd;
    public C54945xae OLrzqt;
    public Function0<Unit> copydefault;
    public int ejfBZ;
    public android.text.TextWatcher fIwbmz;
    public java.lang.CharSequence fJNWhG;
    public java.lang.CharSequence fetchVPNInfo;
    public TextView.OnEditorActionListener gEmmrt;
    public int isConnected;
    public Function0<Unit> valueOf;
    public int values;
    public boolean djBIcL = true;
    public boolean AYXKKw = true;
    public int fARcdN = -4;
    public java.util.List<java.lang.String> DbNXlk = new java.util.ArrayList();
    public int KWHzl = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.valueOf = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.ejfBZ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.CharSequence charSequence) {
        this.fetchVPNInfo = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.CharSequence charSequence) {
        this.AkhnZx = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.fARcdN = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(android.text.TextWatcher textWatcher) {
        this.fIwbmz = textWatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(TextView.OnEditorActionListener onEditorActionListener) {
        this.gEmmrt = onEditorActionListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.CharSequence charSequence) {
        this.EZpvd = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.djBIcL = z;
    }

    public final void copydefault(java.lang.CharSequence charSequence) {
        C55230xfy c55230xfy;
        android.widget.EditText editTextEZpvd;
        this.fJNWhG = charSequence;
        C54945xae c54945xae = this.OLrzqt;
        if (c54945xae == null || (c55230xfy = c54945xae.OLrzqt) == null || (editTextEZpvd = c55230xfy.EZpvd()) == null) {
            return;
        }
        editTextEZpvd.setText(charSequence);
        editTextEZpvd.setSelection(charSequence != null ? charSequence.length() : 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new TaskDescription());
    }

    /* JADX INFO: renamed from: o.xfA$TaskDescription */
    public static final class TaskDescription extends OnBackPressedCallback {
        public TaskDescription() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            setEnabled(false);
            C55180xfA.this.EZpvd(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        C55187xfH c55187xfH;
        C55187xfH c55187xfH2;
        C55230xfy c55230xfy;
        android.widget.LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.isConnected = C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null) + this.values;
        C54945xae c54945xaeOLrzqt = C54945xae.OLrzqt(layoutInflater, viewGroup, false);
        this.OLrzqt = c54945xaeOLrzqt;
        if (this.AYXKKw && c54945xaeOLrzqt != null && (linearLayout = c54945xaeOLrzqt.KWHzl) != null) {
            linearLayout.setTranslationY(this.ejfBZ - this.isConnected);
        }
        C54945xae c54945xae = this.OLrzqt;
        if (c54945xae != null && (c55230xfy = c54945xae.OLrzqt) != null) {
            ViewGroup.LayoutParams layoutParams = c55230xfy.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                C55296xhK.AEQbTJ(marginLayoutParams, marginLayoutParams.getMarginStart(), this.isConnected, marginLayoutParams.getMarginEnd(), 0);
            }
            c55230xfy.setOKDSSize(this.fARcdN);
            c55230xfy.EZpvd().setHint(this.fetchVPNInfo);
            c55230xfy.copydefault().setText(this.EZpvd);
            android.widget.EditText editTextEZpvd = c55230xfy.EZpvd();
            editTextEZpvd.setText(this.fJNWhG);
            java.lang.CharSequence charSequence = this.fJNWhG;
            editTextEZpvd.setSelection(charSequence != null ? charSequence.length() : 0);
            if (this.fIwbmz != null) {
                c55230xfy.EZpvd().addTextChangedListener(this.fIwbmz);
            }
            c55230xfy.EZpvd().setOnEditorActionListener(this.gEmmrt);
            c55230xfy.setOnBackPressed(new Function0() { // from class: o.xfF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C55180xfA.AhwBna(this.OLrzqt);
                }
            });
            c55230xfy.setCancelCallback(this.AEQbTJ);
            c55230xfy.setClearCallback(this.copydefault);
        }
        if (this.djBIcL) {
            C54945xae c54945xae2 = this.OLrzqt;
            if (c54945xae2 != null && (c55187xfH2 = c54945xae2.EZpvd) != null) {
                c55187xfH2.setVisibility(0);
                c55187xfH2.setOnItemSelectedCallback(new Function1() { // from class: o.xfG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55180xfA.EZpvd(this.OLrzqt, (java.lang.CharSequence) obj);
                    }
                });
                c55187xfH2.OLrzqt().setText(this.AkhnZx);
            }
        } else {
            C54945xae c54945xae3 = this.OLrzqt;
            if (c54945xae3 != null && (c55187xfH = c54945xae3.EZpvd) != null) {
                c55187xfH.setVisibility(8);
            }
        }
        C54945xae c54945xae4 = this.OLrzqt;
        if (c54945xae4 != null) {
            return c54945xae4.getRoot();
        }
        return null;
    }

    public static final Unit AhwBna(C55180xfA c55180xfA) {
        c55180xfA.EZpvd(false);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C55180xfA c55180xfA, java.lang.CharSequence charSequence) {
        C55230xfy c55230xfy;
        android.widget.EditText editTextEZpvd;
        C54945xae c54945xae = c55180xfA.OLrzqt;
        if (c54945xae != null && (c55230xfy = c54945xae.OLrzqt) != null && (editTextEZpvd = c55230xfy.EZpvd()) != null) {
            editTextEZpvd.setText(charSequence);
            editTextEZpvd.setSelection(charSequence != null ? charSequence.length() : 0);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        EZpvd(true);
    }

    public void KWHzl(@NotNull android.view.View view) {
        android.widget.FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = view;
        C54945xae c54945xae = this.OLrzqt;
        if (c54945xae == null || (frameLayout = c54945xae.copydefault) == null) {
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (isAdded() || fragmentManager.findFragmentByTag(str) != null || this.KWHzl >= 0) {
            return;
        }
        this.KWHzl = fragmentManager.beginTransaction().add(android.R.id.content, this, str).addToBackStack(null).commit();
    }

    public final void AEQbTJ() {
        C55230xfy c55230xfy;
        android.widget.EditText editTextEZpvd;
        C54945xae c54945xae = this.OLrzqt;
        if (c54945xae != null && (c55230xfy = c54945xae.OLrzqt) != null && (editTextEZpvd = c55230xfy.EZpvd()) != null) {
            editTextEZpvd.setText("");
        }
        if (isAdded()) {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new OKSearchBarFragment$dismiss$1(this, null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        android.widget.FrameLayout frameLayout;
        super.onDestroyView();
        C54945xae c54945xae = this.OLrzqt;
        if (c54945xae == null || (frameLayout = c54945xae.copydefault) == null) {
            return;
        }
        frameLayout.removeAllViews();
    }

    public void AEQbTJ(@NotNull java.util.List<java.lang.String> list) {
        C55187xfH c55187xfH;
        Intrinsics.checkNotNullParameter(list, "");
        this.DbNXlk = list;
        C54945xae c54945xae = this.OLrzqt;
        if (c54945xae == null || (c55187xfH = c54945xae.EZpvd) == null) {
            return;
        }
        c55187xfH.setHistoryRecordList(list);
    }

    public C55230xfy OLrzqt() {
        C54945xae c54945xae = this.OLrzqt;
        if (c54945xae != null) {
            return c54945xae.OLrzqt;
        }
        return null;
    }

    public C55187xfH KWHzl() {
        C54945xae c54945xae = this.OLrzqt;
        if (c54945xae != null) {
            return c54945xae.EZpvd;
        }
        return null;
    }

    public final java.lang.String copydefault() {
        C55230xfy c55230xfy;
        android.widget.EditText editTextEZpvd;
        android.text.Editable text;
        C54945xae c54945xae = this.OLrzqt;
        if (c54945xae == null || (c55230xfy = c54945xae.OLrzqt) == null || (editTextEZpvd = c55230xfy.EZpvd()) == null || (text = editTextEZpvd.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public static /* synthetic */ void translateYAnim$default(C55180xfA c55180xfA, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translateYAnim");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        c55180xfA.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        float f = this.AYXKKw ? this.ejfBZ - this.isConnected : 0.0f;
        C54945xae c54945xae = this.OLrzqt;
        android.widget.LinearLayout linearLayout = c54945xae != null ? c54945xae.KWHzl : null;
        float[] fArr = new float[2];
        fArr[0] = z ? f : 0.0f;
        fArr[1] = z ? 0.0f : f;
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(linearLayout, "translationY", fArr);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.start();
        objectAnimatorOfFloat.addListener(new Activity(z, this));
        if (z) {
            return;
        }
        C54945xae c54945xae2 = this.OLrzqt;
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(c54945xae2 != null ? c54945xae2.getRoot() : null, (android.util.Property<android.widget.FrameLayout, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(180L);
        objectAnimatorOfFloat2.start();
    }

    /* JADX INFO: renamed from: o.xfA$Activity */
    public static final class Activity extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ C55180xfA EZpvd;
        public final /* synthetic */ boolean copydefault;

        public Activity(boolean z, C55180xfA c55180xfA) {
            this.copydefault = z;
            this.EZpvd = c55180xfA;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            C55230xfy c55230xfy;
            C54945xae c54945xae;
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.copydefault) {
                C54945xae c54945xae2 = this.EZpvd.OLrzqt;
                if (c54945xae2 == null || (c55230xfy = c54945xae2.OLrzqt) == null) {
                    return;
                }
                C55180xfA c55180xfA = this.EZpvd;
                c55230xfy.setSearchBarEditable(true);
                c55230xfy.copydefault(c55230xfy.EZpvd());
                android.view.View view = c55180xfA.AhwBna;
                if (view == null || (c54945xae = c55180xfA.OLrzqt) == null) {
                    return;
                }
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                c54945xae.copydefault.addView(c55180xfA.AhwBna);
                if (c55180xfA.EZpvd()) {
                    c54945xae.EZpvd.setHistoryRecordList(c55180xfA.DbNXlk);
                    return;
                }
                return;
            }
            this.EZpvd.AEQbTJ();
        }
    }
}
