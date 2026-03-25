package o;

import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.core.util.SPUtils;
import com.okinc.cruilib.view.featureintro.FeatureInformation;
import com.okinc.cruilib.view.featureintro.IntroNote;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mIy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31923mIy extends wXX {
    public java.lang.String AYXKKw = "";
    public Function0<Unit> AhwBna;
    public mFA KWHzl;
    public Function0<Unit> OLrzqt;
    public Function0<Unit> copydefault;
    public FeatureInformation djBIcL;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public static final java.lang.String EZpvd = C31923mIy.class.getSimpleName();

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setCloseVisibility(true);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.mIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C31923mIy.EZpvd(this.OLrzqt, view);
            }
        });
    }

    public static final void EZpvd(C31923mIy c31923mIy, android.view.View view) {
        c31923mIy.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KWHzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // o.wXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        FeatureInformation featureInformation;
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("arg_encrypted_key")) != null) {
            str = string;
        }
        this.AYXKKw = str;
        this.KWHzl = mFA.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        if (Build.VERSION.SDK_INT >= 33) {
            android.os.Bundle arguments2 = getArguments();
            featureInformation = arguments2 != null ? (FeatureInformation) arguments2.getParcelable("arg_feature_information", FeatureInformation.class) : null;
        } else {
            android.os.Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                featureInformation = (FeatureInformation) arguments3.getParcelable("arg_feature_information");
            }
        }
        this.djBIcL = featureInformation;
        if (featureInformation != null) {
            OLrzqt(featureInformation.KWHzl(), featureInformation.copydefault());
            copydefault(featureInformation.AhwBna(), featureInformation.gEmmrt());
            OLrzqt(featureInformation.AYXKKw(), featureInformation.OLrzqt());
            EZpvd(featureInformation.djBIcL());
            EZpvd(featureInformation.valueOf(), featureInformation.EZpvd(), this.copydefault);
            Function0<Unit> function0 = this.AhwBna;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        Function0<Unit> function0 = this.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
        super.dismiss();
    }

    public final void OLrzqt(java.lang.Integer num, java.lang.Integer num2) {
        mFA mfa = this.KWHzl;
        if (mfa == null) {
            Intrinsics.gEmmrt("");
            mfa = null;
        }
        android.widget.ImageView imageView = mfa.gEmmrt;
        if (num != null) {
            imageView.setImageResource(num.intValue());
        } else {
            imageView.setImageResource(C52761wXj.TaskDescription.DuR);
        }
        if (num2 != null) {
            num2.intValue();
            Intrinsics.copydefault(imageView);
            mHE.KWHzl(imageView, num2.intValue(), PorterDuff.Mode.DST_IN);
        }
    }

    public final void copydefault(boolean z, java.lang.String str) {
        mFA mfa = this.KWHzl;
        if (mfa == null) {
            Intrinsics.gEmmrt("");
            mfa = null;
        }
        C55251xgS c55251xgS = mfa.AkhnZx;
        if (z) {
            c55251xgS.setText(str);
            c55251xgS.setVisibility(0);
        } else {
            c55251xgS.setVisibility(8);
        }
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        mFA mfa = this.KWHzl;
        if (mfa == null) {
            Intrinsics.gEmmrt("");
            mfa = null;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            mfa.valueOf.setText(str);
            mfa.valueOf.setVisibility(0);
        } else {
            mfa.valueOf.setVisibility(8);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            mfa.djBIcL.setText(str2);
            mfa.djBIcL.setVisibility(0);
        } else {
            mfa.djBIcL.setVisibility(8);
        }
    }

    public final void EZpvd(java.util.List<IntroNote> list) {
        java.lang.Iterable<IndexedValue> iterableAhwBna;
        int i = C52761wXj.TaskDescription.DuR;
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        mFA mfa = this.KWHzl;
        if (mfa == null) {
            Intrinsics.gEmmrt("");
            mfa = null;
        }
        if (list == null || (iterableAhwBna = CollectionsKt___CollectionsKt.DCJXGO(list)) == null) {
            iterableAhwBna = yDY.AhwBna();
        }
        for (IndexedValue indexedValue : iterableAhwBna) {
            int iKWHzl = indexedValue.KWHzl();
            IntroNote introNote = (IntroNote) indexedValue.EZpvd();
            if (iKWHzl > 2) {
                return;
            }
            if (iKWHzl == 0) {
                wYC wyc = mfa.AhwBna;
                java.lang.Integer numAEQbTJ = introNote.AEQbTJ();
                wyc.setImageResource(numAEQbTJ != null ? numAEQbTJ.intValue() : i);
                wYC wyc2 = mfa.AhwBna;
                Intrinsics.checkNotNullExpressionValue(wyc2, "");
                mHE.tint$default(wyc2, iCopydefault, null, 2, null);
                mfa.fetchVPNInfo.setText(introNote.KWHzl());
            } else if (iKWHzl == 1) {
                wYC wyc3 = mfa.AYXKKw;
                java.lang.Integer numAEQbTJ2 = introNote.AEQbTJ();
                wyc3.setImageResource(numAEQbTJ2 != null ? numAEQbTJ2.intValue() : i);
                wYC wyc4 = mfa.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(wyc4, "");
                mHE.tint$default(wyc4, iCopydefault, null, 2, null);
                mfa.values.setText(introNote.KWHzl());
            } else if (iKWHzl == 2) {
                wYC wyc5 = mfa.isConnected;
                java.lang.Integer numAEQbTJ3 = introNote.AEQbTJ();
                wyc5.setImageResource(numAEQbTJ3 != null ? numAEQbTJ3.intValue() : i);
                wYC wyc6 = mfa.isConnected;
                Intrinsics.checkNotNullExpressionValue(wyc6, "");
                mHE.tint$default(wyc6, iCopydefault, null, 2, null);
                mfa.fARcdN.setText(introNote.KWHzl());
            }
        }
    }

    public final void EZpvd(boolean z, java.lang.String str, Function0<Unit> function0) {
        mFA mfa = this.KWHzl;
        if (mfa == null) {
            Intrinsics.gEmmrt("");
            mfa = null;
        }
        C52794wYp c52794wYp = mfa.EZpvd;
        if (!z) {
            c52794wYp.setVisibility(8);
            return;
        }
        c52794wYp.setVisibility(0);
        c52794wYp.setText(str);
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, function0, this));
    }

    public final void KWHzl() {
        Companion.AEQbTJ(this.AYXKKw);
    }

    /* JADX INFO: renamed from: o.mIy$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mIy.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String AEQbTJ() {
            return C31923mIy.EZpvd;
        }

        public final void AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (str.length() == 0) {
                return;
            }
            SPUtils.put(str, java.lang.Boolean.TRUE, "featureIntroBottomSheetFile");
        }
    }

    /* JADX INFO: renamed from: o.mIy$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ Function0 OLrzqt;
        public final /* synthetic */ C31923mIy copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function0 function0, C31923mIy c31923mIy) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = function0;
            this.copydefault = c31923mIy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
                this.copydefault.dismiss();
            }
        }
    }
}
