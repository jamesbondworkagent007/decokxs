package o;

import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.im.imui.inputpanelV2.voiceboard.RecordingState;
import com.okinc.im.imui.inputpanelV2.voiceboard.VoiceBoardView$mOnVoiceBtnTouchListener$1$1;
import com.okinc.im.imui.managerV2.AudioRecordManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36527oce extends android.widget.FrameLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public android.widget.TextView AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public android.widget.ImageView AkhnZx;
    public ConstraintLayout AuCTel;
    public android.widget.TextView DbNXlk;
    public android.widget.TextView EZpvd;
    public android.widget.FrameLayout KWHzl;
    public android.widget.ImageView copydefault;
    public boolean djBIcL;
    public Function0<Unit> ejfBZ;
    public Function0<Unit> fARcdN;
    public Function0<Unit> fIwbmz;
    public Function0<Unit> fJNWhG;
    public float fetchVPNInfo;
    public float gEmmrt;
    public android.widget.TextView getFieldNames;
    public C37004ole getNewProxyInstance;
    public final View.OnTouchListener isConnected;
    public float uzCIH;
    public float valueOf;
    public int values;

    /* JADX INFO: renamed from: o.oce$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecordingState.values().length];
            try {
                iArr[RecordingState.IDLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RecordingState.RECORDING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RecordingState.CANCELED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C36527oce(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C36527oce(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnRecordCancel(Function0<Unit> function0) {
        this.fIwbmz = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnRecordContinue(Function0<Unit> function0) {
        this.fJNWhG = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnRecordStart(Function0<Unit> function0) {
        this.fARcdN = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnRecordStop(Function0<Unit> function0) {
        this.ejfBZ = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:43) call: o.oce.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C36527oce(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36527oce(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.values = 60;
        this.isConnected = new View.OnTouchListener() { // from class: o.och
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C36527oce.KWHzl(context, this, view, motionEvent);
            }
        };
        android.view.LayoutInflater.from(context).inflate(C35399nuc.Dialog.ODCBUN, (android.view.ViewGroup) this, true);
        this.AkhnZx = (android.widget.ImageView) findViewById(C35399nuc.StateListAnimator.QslYrK);
        this.copydefault = (android.widget.ImageView) findViewById(C35399nuc.StateListAnimator.DCUTEI);
        this.DbNXlk = (android.widget.TextView) findViewById(C35399nuc.StateListAnimator.fVjYLc);
        this.AEQbTJ = (android.widget.TextView) findViewById(C35399nuc.StateListAnimator.QXDzTk);
        this.getFieldNames = (android.widget.TextView) findViewById(C35399nuc.StateListAnimator.fJk);
        this.KWHzl = (android.widget.FrameLayout) findViewById(C35399nuc.StateListAnimator.hCLrkq);
        this.EZpvd = (android.widget.TextView) findViewById(C35399nuc.StateListAnimator.QSBOWP);
        this.AuCTel = (ConstraintLayout) findViewById(C35399nuc.StateListAnimator.GqbzPL);
        this.getNewProxyInstance = (C37004ole) findViewById(C35399nuc.StateListAnimator.rsEnD);
        OLrzqt();
        pUU.KWHzl("VoiceBoardView", "VoiceBoardView initialized");
    }

    /* JADX INFO: renamed from: o.oce$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oce.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final boolean KWHzl(android.content.Context context, C36527oce c36527oce, android.view.View view, android.view.MotionEvent motionEvent) {
        LifecycleCoroutineScope lifecycleScope;
        android.view.ViewParent parent;
        android.view.ViewParent parent2;
        java.lang.String[] strArr = {"android.permission.RECORD_AUDIO"};
        if (!C60121zwJ.KWHzl(view.getContext(), (java.lang.String[]) java.util.Arrays.copyOf(strArr, 1)) && motionEvent.getAction() == 0) {
            android.content.Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            ActivityCompat.requestPermissions(C35334ntP.KWHzl(context2), strArr, 1023);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            pUU.KWHzl("VoiceBoardView", "Mike button pressed");
            if (C36501ocE.OLrzqt().valueOf()) {
                C36501ocE.OLrzqt().AkhnZx();
            }
            InterfaceC35259nru interfaceC35259nruAhwBna = C37127onv.AEQbTJ.AhwBna();
            if (interfaceC35259nruAhwBna.KWHzl()) {
                C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.QIZEnU, 0, 1, (java.lang.Object) null);
                return false;
            }
            if (C37719ozD.KWHzl.EZpvd(view.getContext())) {
                C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.UkvvWh, 0, 1, (java.lang.Object) null);
                return false;
            }
            LifecycleOwner lifecycleOwnerAEQbTJ = C35334ntP.AEQbTJ(context);
            if (lifecycleOwnerAEQbTJ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerAEQbTJ)) == null) {
                pUU.valueOf("VoiceBoardView", "Context is not a LifecycleOwner, cannot check microphone");
                return false;
            }
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new VoiceBoardView$mOnVoiceBtnTouchListener$1$1(booleanRef, interfaceC35259nruAhwBna, null), 3, null);
            if (!booleanRef.element) {
                C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.DcMfJKfNUfqk, 0, 1, (java.lang.Object) null);
                return false;
            }
            android.widget.FrameLayout frameLayout = c36527oce.KWHzl;
            if (frameLayout != null && (parent = frameLayout.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            c36527oce.valueOf = motionEvent.getRawY();
            c36527oce.AhwBna = false;
            c36527oce.AYXKKw = true;
            if (c36527oce.uzCIH <= 0.0f) {
                android.widget.ImageView imageView = c36527oce.copydefault;
                float y = imageView != null ? imageView.getY() : 0.0f;
                c36527oce.gEmmrt = y;
                c36527oce.fetchVPNInfo = y;
                android.widget.TextView textView = c36527oce.AEQbTJ;
                float fDjBIcL = C33129mqd.djBIcL(textView != null ? java.lang.Float.valueOf(textView.getY()) : null);
                android.widget.TextView textView2 = c36527oce.AEQbTJ;
                c36527oce.uzCIH = fDjBIcL + C33129mqd.djBIcL(textView2 != null ? java.lang.Integer.valueOf(textView2.getHeight()) : null) + C55298xhM.dp2px$default(12.0f, null, 1, null);
                Function0<Unit> function0 = c36527oce.fARcdN;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                Function0<Unit> function02 = c36527oce.fARcdN;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        } else if (action == 1) {
            pUU.KWHzl("VoiceBoardView", "Mike button released");
            android.widget.FrameLayout frameLayout2 = c36527oce.KWHzl;
            if (frameLayout2 != null && (parent2 = frameLayout2.getParent()) != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            Function0<Unit> function03 = c36527oce.ejfBZ;
            if (function03 != null) {
                function03.invoke();
            }
            c36527oce.AEQbTJ(RecordingState.IDLE);
        } else if (action == 2) {
            pUU.KWHzl("VoiceBoardView", "Mike button MOVE " + motionEvent.getRawY());
            Intrinsics.copydefault(view);
            Intrinsics.copydefault(motionEvent);
            c36527oce.EZpvd(view, motionEvent);
        }
        return true;
    }

    public final void OLrzqt() {
        android.widget.FrameLayout frameLayout = this.KWHzl;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(this.isConnected);
        }
        setIdleOrStopRecordView();
        pUU.KWHzl("VoiceBoardView", "View initialized with listeners set");
    }

    public final void EZpvd(android.view.View view, android.view.MotionEvent motionEvent) {
        if (AudioRecordManager.Companion.OLrzqt().fARcdN() > 0) {
            float rawY = motionEvent.getRawY() - this.valueOf;
            float f = this.gEmmrt + rawY;
            boolean z = rawY < 0.0f;
            if (f <= this.uzCIH) {
                this.AhwBna = true;
                this.AYXKKw = false;
                Function0<Unit> function0 = this.fIwbmz;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            if (f >= this.fetchVPNInfo) {
                android.widget.ImageView imageView = this.copydefault;
                if (imageView != null) {
                    imageView.setTranslationY(0.0f);
                }
                this.AYXKKw = true;
                this.AhwBna = false;
                OLrzqt(1.0f);
                return;
            }
            this.djBIcL = false;
            if (this.AhwBna) {
                this.AhwBna = false;
                Function0<Unit> function02 = this.fJNWhG;
                if (function02 != null) {
                    function02.invoke();
                }
                AEQbTJ(RecordingState.RECORDING);
            }
            if (this.AYXKKw && z) {
                this.AYXKKw = false;
            }
            android.widget.ImageView imageView2 = this.copydefault;
            if (imageView2 != null) {
                imageView2.setTranslationY(f - this.gEmmrt);
            }
            OLrzqt((copydefault(f) * 0.5f) + 1.0f);
        }
    }

    public final void KWHzl() {
        java.lang.Object systemService = C32979mnm.EZpvd.OLrzqt().getSystemService("vibrator");
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (Build.VERSION.SDK_INT >= 26) {
            if (vibrator != null) {
                vibrator.vibrate(android.os.VibrationEffect.createOneShot(200L, -1));
            }
        } else if (vibrator != null) {
            vibrator.vibrate(200L);
        }
    }

    public final float copydefault(float f) {
        float f2 = this.fetchVPNInfo;
        return C56548yJl.KWHzl((f2 - f) / (f2 - this.uzCIH), 0.0f, 1.0f);
    }

    public final void OLrzqt(float f) {
        float fDp2px$default = C55298xhM.dp2px$default(32.0f, null, 1, null) / C55298xhM.dp2px$default(48.0f, null, 1, null);
        float f2 = fDp2px$default + ((1.0f - fDp2px$default) * f);
        android.widget.ImageView imageView = this.copydefault;
        if (imageView != null) {
            imageView.setScaleX(f2);
        }
        android.widget.ImageView imageView2 = this.copydefault;
        if (imageView2 != null) {
            imageView2.setScaleY(f2);
        }
        float fKWHzl = 1.0f - (C56548yJl.KWHzl((f - 1) / 0.3f, 0.0f, 1.0f) * 1.0f);
        android.widget.TextView textView = this.getFieldNames;
        if (textView != null) {
            textView.setAlpha(fKWHzl);
        }
        C37004ole c37004ole = this.getNewProxyInstance;
        if (c37004ole != null) {
            c37004ole.setAlpha(fKWHzl);
        }
    }

    public final void setIdleOrStopRecordView() {
        AEQbTJ(RecordingState.IDLE);
        C37004ole c37004ole = this.getNewProxyInstance;
        if (c37004ole != null) {
            c37004ole.AEQbTJ();
        }
        pUU.KWHzl("VoiceBoardView", "Set to idle or stopped recording view");
    }

    public final void setStartRecordView() {
        C37004ole c37004ole = this.getNewProxyInstance;
        if (c37004ole != null) {
            c37004ole.AEQbTJ();
        }
        AEQbTJ(RecordingState.RECORDING);
        KWHzl();
        pUU.KWHzl("VoiceBoardView", "Started recording view set " + this.uzCIH);
    }

    public final void EZpvd() {
        pUU.KWHzl("VoiceBoardView", "Updated to release to cancel state");
        AEQbTJ(RecordingState.CANCELED);
    }

    public final void EZpvd(int i) {
        AEQbTJ(RecordingState.RECORDING);
        pUU.KWHzl("VoiceBoardView", "Updated to release to send state with time: " + i + " seconds");
    }

    public final void KWHzl(int i) {
        C37004ole c37004ole = this.getNewProxyInstance;
        if (c37004ole != null) {
            c37004ole.EZpvd(i);
        }
    }

    public final void AEQbTJ(RecordingState recordingState) {
        int i = Application.EZpvd[recordingState.ordinal()];
        if (i == 1) {
            android.widget.ImageView imageView = this.copydefault;
            if (imageView != null) {
                imageView.setBackground(ContextCompat.getDrawable(getContext(), C35399nuc.ActionBar.OLrzqt));
            }
            android.widget.ImageView imageView2 = this.copydefault;
            if (imageView2 != null) {
                imageView2.setColorFilter(ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl), PorterDuff.Mode.SRC_IN);
            }
            android.widget.TextView textView = this.EZpvd;
            if (textView != null) {
                textView.setVisibility(4);
            }
            android.widget.ImageView imageView3 = this.copydefault;
            if (imageView3 != null) {
                imageView3.setVisibility(4);
            }
            android.widget.TextView textView2 = this.DbNXlk;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = this.DbNXlk;
            if (textView3 != null) {
                textView3.setText(getContext().getString(C35399nuc.LoaderManager.SdSTJp));
            }
            android.widget.FrameLayout frameLayout = this.KWHzl;
            if (frameLayout != null) {
                frameLayout.setBackground(ContextCompat.getDrawable(getContext(), C35399nuc.ActionBar.copydefault));
            }
            android.widget.ImageView imageView4 = this.AkhnZx;
            if (imageView4 != null) {
                imageView4.setColorFilter(ContextCompat.getColor(getContext(), C52761wXj.Activity.htlTjW), PorterDuff.Mode.SRC_IN);
            }
            android.widget.TextView textView4 = this.AEQbTJ;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            android.widget.TextView textView5 = this.getFieldNames;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            OLrzqt(1.0f);
            ConstraintLayout constraintLayout = this.AuCTel;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundColor(ContextCompat.getColor(getContext(), C35399nuc.Application.copydefault));
            }
            android.widget.ImageView imageView5 = this.copydefault;
            if (imageView5 != null) {
                imageView5.setTranslationY(0.0f);
            }
            C37004ole c37004ole = this.getNewProxyInstance;
            if (c37004ole != null) {
                c37004ole.setVisibility(8);
            }
            android.widget.TextView textView6 = this.getFieldNames;
            if (textView6 != null) {
                textView6.setAlpha(1.0f);
            }
            C37004ole c37004ole2 = this.getNewProxyInstance;
            if (c37004ole2 != null) {
                c37004ole2.setAlpha(1.0f);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            android.widget.TextView textView7 = this.getFieldNames;
            if (textView7 != null) {
                textView7.setAlpha(0.0f);
            }
            C37004ole c37004ole3 = this.getNewProxyInstance;
            if (c37004ole3 != null) {
                c37004ole3.setAlpha(0.0f);
            }
            android.widget.ImageView imageView6 = this.copydefault;
            if (imageView6 != null) {
                imageView6.setBackground(ContextCompat.getDrawable(getContext(), C35399nuc.ActionBar.KWHzl));
            }
            android.widget.ImageView imageView7 = this.copydefault;
            if (imageView7 != null) {
                imageView7.setColorFilter(ContextCompat.getColor(getContext(), C52761wXj.Activity.htlTjW), PorterDuff.Mode.SRC_IN);
            }
            android.widget.TextView textView8 = this.EZpvd;
            if (textView8 != null) {
                textView8.setVisibility(0);
            }
            android.widget.ImageView imageView8 = this.copydefault;
            if (imageView8 != null) {
                imageView8.setVisibility(0);
            }
            android.widget.TextView textView9 = this.DbNXlk;
            if (textView9 != null) {
                textView9.setVisibility(4);
            }
            android.widget.FrameLayout frameLayout2 = this.KWHzl;
            if (frameLayout2 != null) {
                frameLayout2.setBackground(ContextCompat.getDrawable(getContext(), C35399nuc.ActionBar.OLrzqt));
            }
            android.widget.ImageView imageView9 = this.AkhnZx;
            if (imageView9 != null) {
                imageView9.setColorFilter(ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl), PorterDuff.Mode.SRC_IN);
            }
            android.widget.TextView textView10 = this.AEQbTJ;
            if (textView10 != null) {
                textView10.setVisibility(4);
            }
            android.widget.TextView textView11 = this.getFieldNames;
            if (textView11 != null) {
                textView11.setVisibility(4);
            }
            android.widget.ImageView imageView10 = this.copydefault;
            if (imageView10 != null) {
                imageView10.setTranslationY(this.uzCIH - this.gEmmrt);
            }
            C37004ole c37004ole4 = this.getNewProxyInstance;
            if (c37004ole4 != null) {
                c37004ole4.setVisibility(4);
            }
            ConstraintLayout constraintLayout2 = this.AuCTel;
            if (constraintLayout2 != null) {
                constraintLayout2.setBackgroundColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.djBIcL));
            }
            OLrzqt(1.5f);
            copydefault();
            KWHzl();
            return;
        }
        int iFARcdN = AudioRecordManager.Companion.OLrzqt().fARcdN();
        android.widget.ImageView imageView11 = this.copydefault;
        if (imageView11 != null) {
            imageView11.setBackground(ContextCompat.getDrawable(getContext(), C35399nuc.ActionBar.OLrzqt));
        }
        android.widget.ImageView imageView12 = this.copydefault;
        if (imageView12 != null) {
            imageView12.setColorFilter(ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl), PorterDuff.Mode.SRC_IN);
        }
        android.widget.TextView textView12 = this.EZpvd;
        if (textView12 != null) {
            textView12.setVisibility(4);
        }
        android.widget.ImageView imageView13 = this.copydefault;
        if (imageView13 != null) {
            imageView13.setVisibility(0);
        }
        C37004ole c37004ole5 = this.getNewProxyInstance;
        if (c37004ole5 != null) {
            c37004ole5.setVisibility(0);
        }
        android.widget.TextView textView13 = this.DbNXlk;
        if (textView13 != null) {
            textView13.setText(getContext().getString(C35399nuc.LoaderManager.RZOtbZ));
        }
        android.widget.FrameLayout frameLayout3 = this.KWHzl;
        if (frameLayout3 != null) {
            frameLayout3.setBackground(ContextCompat.getDrawable(getContext(), C35399nuc.ActionBar.copydefault));
        }
        android.widget.ImageView imageView14 = this.AkhnZx;
        if (imageView14 != null) {
            imageView14.setColorFilter(ContextCompat.getColor(getContext(), C52761wXj.Activity.htlTjW), PorterDuff.Mode.SRC_IN);
        }
        android.widget.TextView textView14 = this.AEQbTJ;
        if (textView14 != null) {
            textView14.setVisibility(0);
        }
        ConstraintLayout constraintLayout3 = this.AuCTel;
        if (constraintLayout3 != null) {
            constraintLayout3.setBackgroundColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.djBIcL));
        }
        android.widget.TextView textView15 = this.AEQbTJ;
        if (textView15 != null) {
            textView15.setText(OLrzqt(iFARcdN));
        }
        int i2 = this.values;
        if (iFARcdN < i2 - 10) {
            android.widget.TextView textView16 = this.DbNXlk;
            if (textView16 != null) {
                textView16.setVisibility(0);
            }
            android.widget.TextView textView17 = this.getFieldNames;
            if (textView17 != null) {
                textView17.setVisibility(4);
                return;
            }
            return;
        }
        android.widget.TextView textView18 = this.DbNXlk;
        if (textView18 != null) {
            textView18.setVisibility(4);
        }
        android.widget.TextView textView19 = this.getFieldNames;
        if (textView19 != null) {
            textView19.setVisibility(0);
        }
        if (iFARcdN == this.values - 10) {
            KWHzl();
        }
        android.widget.TextView textView20 = this.getFieldNames;
        if (textView20 != null) {
            textView20.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.gkJEwt), C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2 - iFARcdN))))));
        }
    }

    public final void setMaxVoiceRecordingLimit(int i) {
        this.values = i;
        pUU.KWHzl("VoiceBoardView", "Max voice recording limit set to " + i + " seconds");
    }

    public final java.lang.String OLrzqt(int i) {
        if (i <= 0) {
            return "0:00";
        }
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 < 10) {
            return i2 + ":" + copydefault(i3);
        }
        return i2 + ":" + copydefault(i3);
    }

    public final java.lang.String copydefault(int i) {
        if (i < 10) {
            return "0" + i;
        }
        return java.lang.String.valueOf(i);
    }
}
