package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentKt;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC35539nxK;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nxK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC35539nxK extends AbstractActivityC33044moy<nHQ> {
    public final C59534zip EZpvd;
    public C35550nxV KWHzl;
    public final int OLrzqt;
    public final java.util.ArrayList<RelationInfo> djBIcL;
    public java.lang.String gEmmrt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    public ActivityC35539nxK() {
        java.util.ArrayList<RelationInfo> arrayList = new java.util.ArrayList<>();
        this.djBIcL = arrayList;
        this.EZpvd = new C59534zip(arrayList);
        this.OLrzqt = C35399nuc.Dialog.OLrzqt;
    }

    /* JADX INFO: renamed from: o.nxK$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nxK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC35539nxK.class);
        }
    }

    public final void copydefault(java.lang.String str) {
        this.gEmmrt = str;
        C35550nxV c35550nxV = this.KWHzl;
        if (c35550nxV == null) {
            Intrinsics.gEmmrt("");
            c35550nxV = null;
        }
        c35550nxV.EZpvd(str, false);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl = new C35550nxV();
        android.widget.ImageView backImage = KWHzl().AEQbTJ.getBackImage();
        C35550nxV c35550nxV = null;
        if (backImage != null) {
            ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart((int) (24 * getResources().getDisplayMetrics().density));
                backImage.setLayoutParams(layoutParams2);
            }
        }
        final nHQ nhqKWHzl = KWHzl();
        nhqKWHzl.gEmmrt.setLayoutManager(C33047mpA.KWHzl(this));
        this.EZpvd.register(RelationInfo.class, new Application());
        nhqKWHzl.gEmmrt.setAdapter(this.EZpvd);
        OKEditText oKEditText = nhqKWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        C33606mzd.copydefault(oKEditText, this, new Function1() { // from class: o.nxO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC35539nxK.OLrzqt(this.EZpvd, nhqKWHzl, (java.lang.CharSequence) obj);
            }
        });
        nhqKWHzl.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.nxP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC35539nxK.copydefault(nhqKWHzl, view);
            }
        });
        nhqKWHzl.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.nxN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                view.setVisibility(0);
            }
        });
        nhqKWHzl.KWHzl.setText(this.gEmmrt);
        nhqKWHzl.valueOf.OLrzqt(new InterfaceC57903yrG() { // from class: o.nxQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC35539nxK.copydefault(this.EZpvd, interfaceC57934yrl);
            }
        });
        C35550nxV c35550nxV2 = this.KWHzl;
        if (c35550nxV2 == null) {
            Intrinsics.gEmmrt("");
            c35550nxV2 = null;
        }
        C55237xgE c55237xgE = nhqKWHzl.AYXKKw;
        C35550nxV c35550nxV3 = this.KWHzl;
        if (c35550nxV3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c35550nxV = c35550nxV3;
        }
        c35550nxV2.observe(this, new Activity(c55237xgE, c35550nxV, C52761wXj.FragmentManager.fIwbmz));
    }

    /* JADX INFO: renamed from: o.nxK$Application */
    public static final class Application extends AbstractC33651nAu {
        public Application() {
        }

        @Override // o.AbstractC33651nAu
        public void AEQbTJ(C43312rms<nLX> c43312rms, RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(relationInfo, "");
            C35580nxz c35580nxzAEQbTJ = C35580nxz.Companion.AEQbTJ("KEY_REQUEST_BLOCK_CONTACT", relationInfo);
            androidx.fragment.app.FragmentManager supportFragmentManager = ActivityC35539nxK.this.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c35580nxzAEQbTJ.show(supportFragmentManager, C35580nxz.class.getSimpleName());
            final ActivityC35539nxK activityC35539nxK = ActivityC35539nxK.this;
            FragmentKt.setFragmentResultListener(c35580nxzAEQbTJ, "KEY_REQUEST_BLOCK_CONTACT", new Function2() { // from class: o.nxR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return ActivityC35539nxK.Application.OLrzqt(activityC35539nxK, (java.lang.String) obj, (android.os.Bundle) obj2);
                }
            });
        }

        public static final Unit OLrzqt(ActivityC35539nxK activityC35539nxK, java.lang.String str, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "KEY_REQUEST_BLOCK_CONTACT") && bundle.getBoolean("KEY_BLOCK_CONTACT_RESULT", false)) {
                C35550nxV c35550nxV = activityC35539nxK.KWHzl;
                if (c35550nxV == null) {
                    Intrinsics.gEmmrt("");
                    c35550nxV = null;
                }
                c35550nxV.copydefault();
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit OLrzqt(ActivityC35539nxK activityC35539nxK, nHQ nhq, java.lang.CharSequence charSequence) {
        java.lang.String string;
        activityC35539nxK.copydefault((charSequence == null || (string = charSequence.toString()) == null) ? null : StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) string).toString());
        nhq.EZpvd.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) activityC35539nxK.gEmmrt) ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final void copydefault(nHQ nhq, android.view.View view) {
        nhq.KWHzl.setText((java.lang.CharSequence) null);
    }

    public static final void copydefault(ActivityC35539nxK activityC35539nxK, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        C35550nxV c35550nxV = activityC35539nxK.KWHzl;
        if (c35550nxV == null) {
            Intrinsics.gEmmrt("");
            c35550nxV = null;
        }
        c35550nxV.copydefault();
    }

    /* JADX INFO: renamed from: o.nxK$Activity */
    public static final class Activity extends AbstractC32943mnC<RelationInfo> {
        public Activity(C55237xgE c55237xgE, C35550nxV c35550nxV, int i) {
            super(c55237xgE, c35550nxV, i);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        public void copydefault(java.util.List<RelationInfo> list, android.view.View view) {
            android.widget.TextView textView;
            Intrinsics.checkNotNullParameter(list, "");
            super.copydefault(list, view);
            if (view != null && (textView = (android.widget.TextView) view.findViewById(C35399nuc.StateListAnimator.vqBjd)) != null) {
                textView.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.EZpvd));
                textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gLWkOL));
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, C33070mpX.KWHzl(C52761wXj.TaskDescription.HJWChPRGtXKC), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            }
            ActivityC35539nxK.this.KWHzl(true);
            rVN.reportFullyDrawn$default((android.app.Activity) ActivityC35539nxK.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(java.util.List<RelationInfo> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(list, "");
            super.AEQbTJ(list, view);
            ActivityC35539nxK.this.KWHzl(list);
            ActivityC35539nxK.this.KWHzl(true);
            rVN.reportFullyDrawn$default((android.app.Activity) ActivityC35539nxK.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Throwable;Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void KWHzl(java.lang.Throwable th, java.util.List<RelationInfo> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(th, "");
            super.KWHzl(th, list, view);
            ActivityC35539nxK.this.KWHzl(false);
            rVN.reportFullyDrawn$default((android.app.Activity) ActivityC35539nxK.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(boolean z) {
        KWHzl().valueOf.AEQbTJ(z);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        KWHzl().valueOf.AhwBna();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.util.List<RelationInfo> list) {
        this.EZpvd.setItems(list);
        this.EZpvd.notifyDataSetChanged();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
