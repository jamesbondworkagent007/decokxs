package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.floatwindow.DexFloatWindowManager;
import com.okinc.uilab.view.OKSortTextView;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class jWL {
    public final int EZpvd;
    public final android.content.Context KWHzl;
    public final jWM OLrzqt;
    public final int copydefault;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DexFloatWindowManager.DexFloatWindowMode.values().length];
            try {
                iArr[DexFloatWindowManager.DexFloatWindowMode.MINIMIZE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DexFloatWindowManager.DexFloatWindowMode.MEDIUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DexFloatWindowManager.DexFloatWindowMode.LARGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public jWL(@NotNull android.content.Context context, @NotNull jWM jwm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(jwm, "");
        this.KWHzl = context;
        this.OLrzqt = jwm;
        this.copydefault = C55298xhM.dp2px$default(40.0f, null, 1, null);
        this.EZpvd = C55298xhM.dp2px$default(92.0f, null, 1, null);
    }

    public final android.view.View OLrzqt(@NotNull DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode, @NotNull Function1<? super DexFloatWindowManager.DexFloatWindowMode, Unit> function1, @NotNull Function1<? super Activity, Unit> function12, boolean z) {
        Intrinsics.checkNotNullParameter(dexFloatWindowMode, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.KWHzl);
        int i = StateListAnimator.copydefault[dexFloatWindowMode.ordinal()];
        if (i == 1) {
            Intrinsics.copydefault(layoutInflaterFrom);
            return AEQbTJ(layoutInflaterFrom, function1);
        }
        if (i == 2) {
            Intrinsics.copydefault(layoutInflaterFrom);
            return EZpvd(layoutInflaterFrom, function1, function12);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.copydefault(layoutInflaterFrom);
        return KWHzl(layoutInflaterFrom, function1, function12, z);
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> copydefault(@NotNull DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode) {
        Intrinsics.checkNotNullParameter(dexFloatWindowMode, "");
        int i = StateListAnimator.copydefault[dexFloatWindowMode.ordinal()];
        if (i == 1) {
            return new kotlin.Pair<>(java.lang.Integer.valueOf(this.copydefault), java.lang.Integer.valueOf(this.copydefault));
        }
        if (i == 2) {
            return new kotlin.Pair<>(java.lang.Integer.valueOf(this.EZpvd), 0);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        C33566myq c33566myq = C33566myq.EZpvd;
        int iEZpvd = c33566myq.EZpvd(this.KWHzl);
        int iOLrzqt = c33566myq.OLrzqt(this.KWHzl);
        int iDp2px$default = C55298xhM.dp2px$default(16.0f, null, 1, null);
        int iDp2px$default2 = C55298xhM.dp2px$default(24.0f, null, 1, null);
        int iDp2px$default3 = C55298xhM.dp2px$default(100.0f, null, 1, null);
        return new kotlin.Pair<>(java.lang.Integer.valueOf(iEZpvd - (iDp2px$default * 2)), java.lang.Integer.valueOf(((iOLrzqt - iDp2px$default2) - iDp2px$default3) - C33570myu.KWHzl(this.KWHzl)));
    }

    public final android.view.View AEQbTJ(android.view.LayoutInflater layoutInflater, Function1<? super DexFloatWindowManager.DexFloatWindowMode, Unit> function1) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.invokespecialhOMIpD, (android.view.ViewGroup) null);
        Intrinsics.copydefault(viewInflate, "");
        jWP jwp = (jWP) viewInflate;
        jwp.setOnClickListener(new Dialog(jwp, 1000L, function1));
        return jwp;
    }

    public final android.view.View EZpvd(android.view.LayoutInflater layoutInflater, Function1<? super DexFloatWindowManager.DexFloatWindowMode, Unit> function1, Function1<? super Activity, Unit> function12) {
        C21516hCg c21516hCgCopydefault = C21516hCg.copydefault(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c21516hCgCopydefault, "");
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairCopydefault = this.OLrzqt.copydefault();
        jWN jwn = new jWN(false, pairCopydefault.getFirst().intValue(), pairCopydefault.getSecond().intValue(), false, 9, null);
        c21516hCgCopydefault.values.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.jh));
        c21516hCgCopydefault.DbNXlk.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DPVBvL));
        c21516hCgCopydefault.isConnected.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DcMfJKsfEqpH));
        c21516hCgCopydefault.valueOf.setAdapter(jwn);
        AppCompatImageView appCompatImageView = c21516hCgCopydefault.EZpvd;
        appCompatImageView.setOnClickListener(new TaskDescription(appCompatImageView, 1000L, function1));
        AppCompatImageView appCompatImageView2 = c21516hCgCopydefault.copydefault;
        appCompatImageView2.setOnClickListener(new Fragment(appCompatImageView2, 1000L, function1));
        function12.invoke(new Activity(jwn, new WeakReference(c21516hCgCopydefault.valueOf), new WeakReference(c21516hCgCopydefault.AEQbTJ), new WeakReference(c21516hCgCopydefault.gEmmrt), new WeakReference(c21516hCgCopydefault.AYXKKw), new WeakReference(c21516hCgCopydefault.OLrzqt), new WeakReference(c21516hCgCopydefault.fetchVPNInfo), new WeakReference(c21516hCgCopydefault.KWHzl), new WeakReference(c21516hCgCopydefault.DbNXlk), null, null, null, null, null, null, null, 65024, null));
        android.widget.LinearLayout linearLayoutCopydefault = c21516hCgCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(linearLayoutCopydefault, "");
        return linearLayoutCopydefault;
    }

    public final android.view.View KWHzl(android.view.LayoutInflater layoutInflater, Function1<? super DexFloatWindowManager.DexFloatWindowMode, Unit> function1, Function1<? super Activity, Unit> function12, boolean z) {
        C21513hCd c21513hCdAEQbTJ = C21513hCd.AEQbTJ(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c21513hCdAEQbTJ, "");
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairCopydefault = this.OLrzqt.copydefault();
        jWN jwn = new jWN(true, pairCopydefault.getFirst().intValue(), pairCopydefault.getSecond().intValue(), z);
        c21513hCdAEQbTJ.gEmmrt.setItemAnimator(null);
        c21513hCdAEQbTJ.gEmmrt.setAdapter(jwn);
        AppCompatImageView appCompatImageView = c21513hCdAEQbTJ.EZpvd;
        appCompatImageView.setOnClickListener(new Application(appCompatImageView, 1000L, function1));
        AppCompatImageView appCompatImageView2 = c21513hCdAEQbTJ.copydefault;
        appCompatImageView2.setOnClickListener(new ActionBar(appCompatImageView2, 1000L, function1));
        C55173xeu c55173xeu = c21513hCdAEQbTJ.AYXKKw;
        c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
        c55173xeu.OLrzqt().setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.zblBkD));
        c55173xeu.EZpvd().setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.zblBkD));
        C52794wYp c52794wYpAEQbTJ = c55173xeu.AEQbTJ();
        c52794wYpAEQbTJ.setOKDSType(260);
        c52794wYpAEQbTJ.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.zblBkD));
        C55173xeu c55173xeu2 = c21513hCdAEQbTJ.djBIcL;
        c55173xeu2.OLrzqt().setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.zblBkD));
        c55173xeu2.EZpvd().setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.zblBkD));
        C55173xeu c55173xeu3 = c21513hCdAEQbTJ.AkhnZx;
        c55173xeu3.OLrzqt().setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.zblBkD));
        c55173xeu3.EZpvd().setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.zblBkD));
        c21513hCdAEQbTJ.DbNXlk.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getSessionID));
        c21513hCdAEQbTJ.AEQbTJ.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DcMfJKDGTeJD));
        c21513hCdAEQbTJ.KWHzl.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.sQOHWT));
        function12.invoke(new Activity(jwn, null, null, null, null, null, null, null, null, new WeakReference(c21513hCdAEQbTJ.AEQbTJ), new WeakReference(c21513hCdAEQbTJ.KWHzl), new WeakReference(c21513hCdAEQbTJ.values), new WeakReference(c21513hCdAEQbTJ.gEmmrt), new WeakReference(c21513hCdAEQbTJ.valueOf), new WeakReference(c21513hCdAEQbTJ.AYXKKw), new WeakReference(c21513hCdAEQbTJ.OLrzqt), TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        android.widget.LinearLayout linearLayoutKWHzl = c21513hCdAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(linearLayoutKWHzl, "");
        return linearLayoutKWHzl;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ Function1 EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function1 function1) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C29229kph.OLrzqt("minimize");
                this.EZpvd.invoke(DexFloatWindowManager.DexFloatWindowMode.MINIMIZE);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Function1 AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function1 function1) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C29229kph.OLrzqt("shrink");
                this.AEQbTJ.invoke(DexFloatWindowManager.DexFloatWindowMode.MEDIUM);
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function1 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, Function1 function1) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C29229kph.OLrzqt("floating_component");
                DexFloatWindowManager.DexFloatWindowMode dexFloatWindowModeFJNWhG = DexFloatWindowManager.copydefault.fJNWhG();
                DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode = DexFloatWindowManager.DexFloatWindowMode.LARGE;
                if (dexFloatWindowModeFJNWhG != dexFloatWindowMode) {
                    dexFloatWindowMode = DexFloatWindowManager.DexFloatWindowMode.MEDIUM;
                }
                this.OLrzqt.invoke(dexFloatWindowMode);
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, Function1 function1) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C29229kph.OLrzqt("minimize");
                this.KWHzl.invoke(DexFloatWindowManager.DexFloatWindowMode.MINIMIZE);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function1 function1) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C29229kph.OLrzqt("expand");
                this.KWHzl.invoke(DexFloatWindowManager.DexFloatWindowMode.LARGE);
            }
        }
    }

    public static final class Activity {
        public final WeakReference<OKSortTextView> AEQbTJ;
        public final WeakReference<C55113xdn> AYXKKw;
        public final WeakReference<android.widget.ViewFlipper> AhwBna;
        public final WeakReference<RecyclerView> AkhnZx;
        public final WeakReference<android.widget.ImageView> DbNXlk;
        public final WeakReference<RecyclerView> EZpvd;
        public final WeakReference<OKSortTextView> KWHzl;
        public final jWN OLrzqt;
        public final WeakReference<C55113xdn> copydefault;
        public final WeakReference<android.widget.TextView> djBIcL;
        public final WeakReference<android.widget.ViewFlipper> fJNWhG;
        public final WeakReference<android.view.View> fetchVPNInfo;
        public final WeakReference<AppCompatImageView> gEmmrt;
        public final WeakReference<android.widget.TextView> isConnected;
        public final WeakReference<C55173xeu> valueOf;
        public final WeakReference<android.widget.ImageView> values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<OKSortTextView> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<C55173xeu> AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<AppCompatImageView> AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<android.widget.ImageView> AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<android.view.View> DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<OKSortTextView> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<C55113xdn> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(jWN jwn, WeakReference<RecyclerView> weakReference, WeakReference<android.widget.TextView> weakReference2, WeakReference<android.view.View> weakReference3, WeakReference<android.widget.ImageView> weakReference4, WeakReference<android.widget.ImageView> weakReference5, WeakReference<android.widget.ViewFlipper> weakReference6, WeakReference<C55113xdn> weakReference7, WeakReference<android.widget.TextView> weakReference8, WeakReference<OKSortTextView> weakReference9, WeakReference<OKSortTextView> weakReference10, WeakReference<android.widget.ViewFlipper> weakReference11, WeakReference<RecyclerView> weakReference12, WeakReference<C55113xdn> weakReference13, WeakReference<C55173xeu> weakReference14, WeakReference<AppCompatImageView> weakReference15) {
            return new Activity(jwn, weakReference, weakReference2, weakReference3, weakReference4, weakReference5, weakReference6, weakReference7, weakReference8, weakReference9, weakReference10, weakReference11, weakReference12, weakReference13, weakReference14, weakReference15);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final jWN OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<RecyclerView> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<android.widget.ViewFlipper> djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.AkhnZx, activity.AkhnZx) && Intrinsics.EZpvd(this.djBIcL, activity.djBIcL) && Intrinsics.EZpvd(this.fetchVPNInfo, activity.fetchVPNInfo) && Intrinsics.EZpvd(this.DbNXlk, activity.DbNXlk) && Intrinsics.EZpvd(this.values, activity.values) && Intrinsics.EZpvd(this.fJNWhG, activity.fJNWhG) && Intrinsics.EZpvd(this.AYXKKw, activity.AYXKKw) && Intrinsics.EZpvd(this.isConnected, activity.isConnected) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.AhwBna, activity.AhwBna) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd(this.valueOf, activity.valueOf) && Intrinsics.EZpvd(this.gEmmrt, activity.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<android.widget.ViewFlipper> fIwbmz() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<android.widget.ImageView> fetchVPNInfo() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<C55113xdn> gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            jWN jwn = this.OLrzqt;
            int iHashCode = jwn == null ? 0 : jwn.hashCode();
            WeakReference<RecyclerView> weakReference = this.AkhnZx;
            int iHashCode2 = weakReference == null ? 0 : weakReference.hashCode();
            WeakReference<android.widget.TextView> weakReference2 = this.djBIcL;
            int iHashCode3 = weakReference2 == null ? 0 : weakReference2.hashCode();
            WeakReference<android.view.View> weakReference3 = this.fetchVPNInfo;
            int iHashCode4 = weakReference3 == null ? 0 : weakReference3.hashCode();
            WeakReference<android.widget.ImageView> weakReference4 = this.DbNXlk;
            int iHashCode5 = weakReference4 == null ? 0 : weakReference4.hashCode();
            WeakReference<android.widget.ImageView> weakReference5 = this.values;
            int iHashCode6 = weakReference5 == null ? 0 : weakReference5.hashCode();
            WeakReference<android.widget.ViewFlipper> weakReference6 = this.fJNWhG;
            int iHashCode7 = weakReference6 == null ? 0 : weakReference6.hashCode();
            WeakReference<C55113xdn> weakReference7 = this.AYXKKw;
            int iHashCode8 = weakReference7 == null ? 0 : weakReference7.hashCode();
            WeakReference<android.widget.TextView> weakReference8 = this.isConnected;
            int iHashCode9 = weakReference8 == null ? 0 : weakReference8.hashCode();
            WeakReference<OKSortTextView> weakReference9 = this.AEQbTJ;
            int iHashCode10 = weakReference9 == null ? 0 : weakReference9.hashCode();
            WeakReference<OKSortTextView> weakReference10 = this.KWHzl;
            int iHashCode11 = weakReference10 == null ? 0 : weakReference10.hashCode();
            WeakReference<android.widget.ViewFlipper> weakReference11 = this.AhwBna;
            int iHashCode12 = weakReference11 == null ? 0 : weakReference11.hashCode();
            WeakReference<RecyclerView> weakReference12 = this.EZpvd;
            int iHashCode13 = weakReference12 == null ? 0 : weakReference12.hashCode();
            WeakReference<C55113xdn> weakReference13 = this.copydefault;
            int iHashCode14 = weakReference13 == null ? 0 : weakReference13.hashCode();
            WeakReference<C55173xeu> weakReference14 = this.valueOf;
            int iHashCode15 = weakReference14 == null ? 0 : weakReference14.hashCode();
            WeakReference<AppCompatImageView> weakReference15 = this.gEmmrt;
            return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (weakReference15 == null ? 0 : weakReference15.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<RecyclerView> isConnected() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LayoutViewReferences(adapter=" + this.OLrzqt + ", mediumRecyclerView=" + this.AkhnZx + ", mediumCurrentPageView=" + this.djBIcL + ", mediumPageNavigationView=" + this.fetchVPNInfo + ", mediumPrevPageView=" + this.DbNXlk + ", mediumNextPageView=" + this.values + ", mediumViewFlipper=" + this.fJNWhG + ", mediumLoader=" + this.AYXKKw + ", mediumRetry=" + this.isConnected + ", largeLabelBalance=" + this.AEQbTJ + ", largeLabelPnl=" + this.KWHzl + ", largeViewFlipper=" + this.AhwBna + ", largeRecyclerView=" + this.EZpvd + ", largeLoader=" + this.copydefault + ", largeRetry=" + this.valueOf + ", largeSettingsIcon=" + this.gEmmrt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<android.widget.TextView> valueOf() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<android.widget.TextView> values() {
            return this.isConnected;
        }

        public Activity(jWN jwn, WeakReference<RecyclerView> weakReference, WeakReference<android.widget.TextView> weakReference2, WeakReference<android.view.View> weakReference3, WeakReference<android.widget.ImageView> weakReference4, WeakReference<android.widget.ImageView> weakReference5, WeakReference<android.widget.ViewFlipper> weakReference6, WeakReference<C55113xdn> weakReference7, WeakReference<android.widget.TextView> weakReference8, WeakReference<OKSortTextView> weakReference9, WeakReference<OKSortTextView> weakReference10, WeakReference<android.widget.ViewFlipper> weakReference11, WeakReference<RecyclerView> weakReference12, WeakReference<C55113xdn> weakReference13, WeakReference<C55173xeu> weakReference14, WeakReference<AppCompatImageView> weakReference15) {
            this.OLrzqt = jwn;
            this.AkhnZx = weakReference;
            this.djBIcL = weakReference2;
            this.fetchVPNInfo = weakReference3;
            this.DbNXlk = weakReference4;
            this.values = weakReference5;
            this.fJNWhG = weakReference6;
            this.AYXKKw = weakReference7;
            this.isConnected = weakReference8;
            this.AEQbTJ = weakReference9;
            this.KWHzl = weakReference10;
            this.AhwBna = weakReference11;
            this.EZpvd = weakReference12;
            this.copydefault = weakReference13;
            this.valueOf = weakReference14;
            this.gEmmrt = weakReference15;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a7: CONSTRUCTOR 
  (wrap:o.jWN:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.jWN) : (r18v0 o.jWN))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x000a: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r19v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x0012: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r20v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x001a: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r21v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x0022: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r22v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x002a: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r23v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x0032: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r24v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x003a: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r25v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x0042: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r26v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x004a: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r27v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x0052: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r28v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x005a: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r29v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x0062: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r30v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x006a: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r31v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x0072: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r32v0 java.lang.ref.WeakReference))
  (wrap:java.lang.ref.WeakReference:?: TERNARY null = ((wrap:int:0x007d: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ref.WeakReference) : (r33v0 java.lang.ref.WeakReference))
 A[MD:(o.jWN, java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>, java.lang.ref.WeakReference<android.widget.TextView>, java.lang.ref.WeakReference<android.view.View>, java.lang.ref.WeakReference<android.widget.ImageView>, java.lang.ref.WeakReference<android.widget.ImageView>, java.lang.ref.WeakReference<android.widget.ViewFlipper>, java.lang.ref.WeakReference<o.xdn>, java.lang.ref.WeakReference<android.widget.TextView>, java.lang.ref.WeakReference<com.okinc.uilab.view.OKSortTextView>, java.lang.ref.WeakReference<com.okinc.uilab.view.OKSortTextView>, java.lang.ref.WeakReference<android.widget.ViewFlipper>, java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>, java.lang.ref.WeakReference<o.xdn>, java.lang.ref.WeakReference<o.xeu>, java.lang.ref.WeakReference<androidx.appcompat.widget.AppCompatImageView>):void (m)] (LINE:213) call: o.jWL.Activity.<init>(o.jWN, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference, java.lang.ref.WeakReference):void type: THIS */
        public /* synthetic */ Activity(jWN jwn, WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3, WeakReference weakReference4, WeakReference weakReference5, WeakReference weakReference6, WeakReference weakReference7, WeakReference weakReference8, WeakReference weakReference9, WeakReference weakReference10, WeakReference weakReference11, WeakReference weakReference12, WeakReference weakReference13, WeakReference weakReference14, WeakReference weakReference15, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : jwn, (i & 2) != 0 ? null : weakReference, (i & 4) != 0 ? null : weakReference2, (i & 8) != 0 ? null : weakReference3, (i & 16) != 0 ? null : weakReference4, (i & 32) != 0 ? null : weakReference5, (i & 64) != 0 ? null : weakReference6, (i & 128) != 0 ? null : weakReference7, (i & 256) != 0 ? null : weakReference8, (i & 512) != 0 ? null : weakReference9, (i & 1024) != 0 ? null : weakReference10, (i & 2048) != 0 ? null : weakReference11, (i & 4096) != 0 ? null : weakReference12, (i & 8192) != 0 ? null : weakReference13, (i & 16384) != 0 ? null : weakReference14, (i & 32768) != 0 ? null : weakReference15);
        }
    }
}
