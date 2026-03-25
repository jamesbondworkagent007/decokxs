package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.UnitType;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.loE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31127loE extends AbstractC31124loB {
    public TransactionType AEQbTJ;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public Function1<? super java.lang.Integer, Unit> KWHzl;
    public final hEK OLrzqt;

    /* JADX INFO: renamed from: o.loE$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Buy.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Sell.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31124loB
    public void copydefault(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31124loB
    public void setTransactionViewEventTrackCallback(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31127loE(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        hEK hekAEQbTJ = hEK.AEQbTJ(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(hekAEQbTJ, "");
        this.OLrzqt = hekAEQbTJ;
        this.AEQbTJ = TransactionType.Buy;
        hekAEQbTJ.AEQbTJ.setSelected(true);
        android.widget.TextView textView = hekAEQbTJ.AEQbTJ;
        textView.setOnClickListener(new TaskDescription(textView, 1000L, this));
        android.widget.TextView textView2 = hekAEQbTJ.OLrzqt;
        textView2.setOnClickListener(new LoaderManager(textView2, 1000L, this));
        android.widget.TextView textView3 = hekAEQbTJ.copydefault;
        textView3.setOnClickListener(new FragmentManager(textView3, 1000L, this));
        android.widget.TextView textView4 = hekAEQbTJ.djBIcL;
        textView4.setOnClickListener(new Fragment(textView4, 1000L, this));
        hekAEQbTJ.KWHzl.setEditTextListener(new Function0() { // from class: o.loF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31127loE.copydefault(this.copydefault);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31127loE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hEK hekAEQbTJ = hEK.AEQbTJ(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(hekAEQbTJ, "");
        this.OLrzqt = hekAEQbTJ;
        this.AEQbTJ = TransactionType.Buy;
        hekAEQbTJ.AEQbTJ.setSelected(true);
        android.widget.TextView textView = hekAEQbTJ.AEQbTJ;
        textView.setOnClickListener(new PendingIntent(textView, 1000L, this));
        android.widget.TextView textView2 = hekAEQbTJ.OLrzqt;
        textView2.setOnClickListener(new SharedElementCallback(textView2, 1000L, this));
        android.widget.TextView textView3 = hekAEQbTJ.copydefault;
        textView3.setOnClickListener(new TaskStackBuilder(textView3, 1000L, this));
        android.widget.TextView textView4 = hekAEQbTJ.djBIcL;
        textView4.setOnClickListener(new AssistContent(textView4, 1000L, this));
        hekAEQbTJ.KWHzl.setEditTextListener(new Function0() { // from class: o.loF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31127loE.copydefault(this.copydefault);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31127loE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        hEK hekAEQbTJ = hEK.AEQbTJ(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(hekAEQbTJ, "");
        this.OLrzqt = hekAEQbTJ;
        this.AEQbTJ = TransactionType.Buy;
        hekAEQbTJ.AEQbTJ.setSelected(true);
        android.widget.TextView textView = hekAEQbTJ.AEQbTJ;
        textView.setOnClickListener(new VoiceInteractor(textView, 1000L, this));
        android.widget.TextView textView2 = hekAEQbTJ.OLrzqt;
        textView2.setOnClickListener(new StateListAnimator(textView2, 1000L, this));
        android.widget.TextView textView3 = hekAEQbTJ.copydefault;
        textView3.setOnClickListener(new Application(textView3, 1000L, this));
        android.widget.TextView textView4 = hekAEQbTJ.djBIcL;
        textView4.setOnClickListener(new Dialog(textView4, 1000L, this));
        hekAEQbTJ.KWHzl.setEditTextListener(new Function0() { // from class: o.loF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31127loE.copydefault(this.copydefault);
            }
        });
    }

    private final void EZpvd(TransactionType transactionType) {
        this.AEQbTJ = transactionType;
        OLrzqt(transactionType);
    }

    /* JADX INFO: renamed from: o.loE$Activity */
    public static final class Activity implements java.lang.Runnable {
        public final /* synthetic */ C55001xbh AEQbTJ;
        public final /* synthetic */ C31127loE EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C55001xbh c55001xbh, C31127loE c31127loE) {
            this.AEQbTJ = c55001xbh;
            this.EZpvd = c31127loE;
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.Object systemService = this.AEQbTJ.getContext().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.AEQbTJ, 1);
            }
            C55001xbh c55001xbh = this.AEQbTJ;
            android.text.Editable text = this.EZpvd.OLrzqt.KWHzl.KWHzl().getText();
            c55001xbh.setSelection(text != null ? text.length() : 0);
        }
    }

    public static final Unit copydefault(final C31127loE c31127loE) {
        C25255itK c25255itK = c31127loE.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c25255itK, "");
        hEK hek = c31127loE.OLrzqt;
        c31127loE.copydefault(true, true, null, c25255itK, hek.AEQbTJ, hek.OLrzqt, hek.copydefault);
        c31127loE.copydefault(true);
        c31127loE.copydefault(c31127loE.AEQbTJ, true);
        final C55001xbh c55001xbhKWHzl = c31127loE.OLrzqt.KWHzl.KWHzl();
        c55001xbhKWHzl.setImeOptions(6);
        c55001xbhKWHzl.post(new java.lang.Runnable() { // from class: o.loH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31127loE.AEQbTJ(c55001xbhKWHzl, c31127loE);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C55001xbh c55001xbh, C31127loE c31127loE) {
        android.text.Editable text = c31127loE.OLrzqt.KWHzl.KWHzl().getText();
        c55001xbh.setSelection(text != null ? text.length() : 0);
    }

    @Override // o.AbstractC31124loB
    public void setLevelValue(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2, @NotNull TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        int i = ActionBar.KWHzl[transactionType.ordinal()];
        if (i == 1) {
            copydefault(list);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            OLrzqt(list2);
        }
    }

    private final void copydefault(java.util.List<java.lang.String> list) {
        if (list.size() > 2) {
            this.OLrzqt.AEQbTJ.setText(C23322hvz.toLocalizedNumber$default(list.get(0), false, (RoundingMode) null, false, false, 15, (java.lang.Object) null));
            this.OLrzqt.OLrzqt.setText(C23322hvz.toLocalizedNumber$default(list.get(1), false, (RoundingMode) null, false, false, 15, (java.lang.Object) null));
            this.OLrzqt.copydefault.setText(C23322hvz.toLocalizedNumber$default(list.get(2), false, (RoundingMode) null, false, false, 15, (java.lang.Object) null));
        }
    }

    private final void OLrzqt(java.util.List<java.lang.String> list) {
        if (list.size() > 2) {
            this.OLrzqt.AEQbTJ.setText(C23311hvo.formatPercent$default(list.get(0), false, 0, 0, null, null, 31, null));
            this.OLrzqt.OLrzqt.setText(C23311hvo.formatPercent$default(list.get(1), false, 0, 0, null, null, 31, null));
            this.OLrzqt.copydefault.setText(C23311hvo.formatPercent$default(list.get(2), false, 0, 0, null, null, 31, null));
        }
    }

    /* JADX INFO: renamed from: o.loE$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C31127loE EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C31127loE c31127loE) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c31127loE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C31127loE c31127loE = this.EZpvd;
                android.widget.TextView textView = c31127loE.OLrzqt.copydefault;
                C25255itK c25255itK = this.EZpvd.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c25255itK, "");
                c31127loE.copydefault(false, false, textView, c25255itK, this.EZpvd.OLrzqt.AEQbTJ, this.EZpvd.OLrzqt.OLrzqt);
                this.EZpvd.copydefault(false);
                android.content.Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C33054mpH.OLrzqt(context, this.EZpvd.OLrzqt.KWHzl.KWHzl());
                Function1 function1 = this.EZpvd.KWHzl;
                if (function1 != null) {
                    function1.invoke(2);
                }
                Function1 function12 = this.EZpvd.EZpvd;
                if (function12 != null) {
                    function12.invoke(DexTrackEventParameter.ButtonName.LOW.getValue());
                }
                C31127loE c31127loE2 = this.EZpvd;
                c31127loE2.copydefault(c31127loE2.AEQbTJ, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.loE$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ C31127loE EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, C31127loE c31127loE) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c31127loE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (((android.widget.TextView) this.copydefault).isSelected()) {
                    return;
                }
                C31127loE c31127loE = this.EZpvd;
                C25255itK c25255itK = c31127loE.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c25255itK, "");
                c31127loE.copydefault(true, true, null, c25255itK, this.EZpvd.OLrzqt.AEQbTJ, this.EZpvd.OLrzqt.OLrzqt, this.EZpvd.OLrzqt.copydefault);
                this.EZpvd.copydefault(true);
                Function1 function1 = this.EZpvd.KWHzl;
                if (function1 != null) {
                    function1.invoke(3);
                }
                Function1 function12 = this.EZpvd.EZpvd;
                if (function12 != null) {
                    function12.invoke(DexTrackEventParameter.ButtonName.CUSTOM.getValue());
                }
                C31127loE c31127loE2 = this.EZpvd;
                c31127loE2.copydefault(c31127loE2.AEQbTJ, true);
                C55001xbh c55001xbhKWHzl = this.EZpvd.OLrzqt.KWHzl.KWHzl();
                c55001xbhKWHzl.setImeOptions(6);
                c55001xbhKWHzl.post(new Activity(c55001xbhKWHzl, this.EZpvd));
            }
        }
    }

    /* JADX INFO: renamed from: o.loE$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C31127loE OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C31127loE c31127loE) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c31127loE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (((android.widget.TextView) this.EZpvd).isSelected()) {
                    return;
                }
                C31127loE c31127loE = this.OLrzqt;
                C25255itK c25255itK = c31127loE.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c25255itK, "");
                c31127loE.copydefault(true, true, null, c25255itK, this.OLrzqt.OLrzqt.AEQbTJ, this.OLrzqt.OLrzqt.OLrzqt, this.OLrzqt.OLrzqt.copydefault);
                this.OLrzqt.copydefault(true);
                Function1 function1 = this.OLrzqt.KWHzl;
                if (function1 != null) {
                    function1.invoke(3);
                }
                Function1 function12 = this.OLrzqt.EZpvd;
                if (function12 != null) {
                    function12.invoke(DexTrackEventParameter.ButtonName.CUSTOM.getValue());
                }
                C31127loE c31127loE2 = this.OLrzqt;
                c31127loE2.copydefault(c31127loE2.AEQbTJ, true);
                C55001xbh c55001xbhKWHzl = this.OLrzqt.OLrzqt.KWHzl.KWHzl();
                c55001xbhKWHzl.setImeOptions(6);
                c55001xbhKWHzl.post(new Activity(c55001xbhKWHzl, this.OLrzqt));
            }
        }
    }

    /* JADX INFO: renamed from: o.loE$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C31127loE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C31127loE c31127loE) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c31127loE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (((android.widget.TextView) this.AEQbTJ).isSelected()) {
                    return;
                }
                C31127loE c31127loE = this.copydefault;
                C25255itK c25255itK = c31127loE.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c25255itK, "");
                c31127loE.copydefault(true, true, null, c25255itK, this.copydefault.OLrzqt.AEQbTJ, this.copydefault.OLrzqt.OLrzqt, this.copydefault.OLrzqt.copydefault);
                this.copydefault.copydefault(true);
                Function1 function1 = this.copydefault.KWHzl;
                if (function1 != null) {
                    function1.invoke(3);
                }
                Function1 function12 = this.copydefault.EZpvd;
                if (function12 != null) {
                    function12.invoke(DexTrackEventParameter.ButtonName.CUSTOM.getValue());
                }
                C31127loE c31127loE2 = this.copydefault;
                c31127loE2.copydefault(c31127loE2.AEQbTJ, true);
                C55001xbh c55001xbhKWHzl = this.copydefault.OLrzqt.KWHzl.KWHzl();
                c55001xbhKWHzl.setImeOptions(6);
                c55001xbhKWHzl.post(new Activity(c55001xbhKWHzl, this.copydefault));
            }
        }
    }

    /* JADX INFO: renamed from: o.loE$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C31127loE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C31127loE c31127loE) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c31127loE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C31127loE c31127loE = this.copydefault;
                android.widget.TextView textView = c31127loE.OLrzqt.copydefault;
                C25255itK c25255itK = this.copydefault.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c25255itK, "");
                c31127loE.copydefault(false, false, textView, c25255itK, this.copydefault.OLrzqt.AEQbTJ, this.copydefault.OLrzqt.OLrzqt);
                this.copydefault.copydefault(false);
                android.content.Context context = this.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C33054mpH.OLrzqt(context, this.copydefault.OLrzqt.KWHzl.KWHzl());
                Function1 function1 = this.copydefault.KWHzl;
                if (function1 != null) {
                    function1.invoke(2);
                }
                Function1 function12 = this.copydefault.EZpvd;
                if (function12 != null) {
                    function12.invoke(DexTrackEventParameter.ButtonName.LOW.getValue());
                }
                C31127loE c31127loE2 = this.copydefault;
                c31127loE2.copydefault(c31127loE2.AEQbTJ, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.loE$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C31127loE AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C31127loE c31127loE) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c31127loE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C31127loE c31127loE = this.AEQbTJ;
                android.widget.TextView textView = c31127loE.OLrzqt.OLrzqt;
                C25255itK c25255itK = this.AEQbTJ.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c25255itK, "");
                c31127loE.copydefault(false, false, textView, c25255itK, this.AEQbTJ.OLrzqt.AEQbTJ, this.AEQbTJ.OLrzqt.copydefault);
                this.AEQbTJ.copydefault(false);
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C33054mpH.OLrzqt(context, this.AEQbTJ.OLrzqt.KWHzl.KWHzl());
                Function1 function1 = this.AEQbTJ.KWHzl;
                if (function1 != null) {
                    function1.invoke(1);
                }
                Function1 function12 = this.AEQbTJ.EZpvd;
                if (function12 != null) {
                    function12.invoke(DexTrackEventParameter.ButtonName.MID.getValue());
                }
                C31127loE c31127loE2 = this.AEQbTJ;
                c31127loE2.copydefault(c31127loE2.AEQbTJ, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.loE$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C31127loE OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C31127loE c31127loE) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c31127loE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C31127loE c31127loE = this.OLrzqt;
                android.widget.TextView textView = c31127loE.OLrzqt.AEQbTJ;
                C25255itK c25255itK = this.OLrzqt.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c25255itK, "");
                c31127loE.copydefault(false, false, textView, c25255itK, this.OLrzqt.OLrzqt.OLrzqt, this.OLrzqt.OLrzqt.copydefault);
                this.OLrzqt.copydefault(false);
                android.content.Context context = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C33054mpH.OLrzqt(context, this.OLrzqt.OLrzqt.KWHzl.KWHzl());
                Function1 function1 = this.OLrzqt.KWHzl;
                if (function1 != null) {
                    function1.invoke(0);
                }
                Function1 function12 = this.OLrzqt.EZpvd;
                if (function12 != null) {
                    function12.invoke(DexTrackEventParameter.ButtonName.LOW.getValue());
                }
                C31127loE c31127loE2 = this.OLrzqt;
                c31127loE2.copydefault(c31127loE2.AEQbTJ, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.loE$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C31127loE KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C31127loE c31127loE) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c31127loE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C31127loE c31127loE = this.KWHzl;
                android.widget.TextView textView = c31127loE.OLrzqt.OLrzqt;
                C25255itK c25255itK = this.KWHzl.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c25255itK, "");
                c31127loE.copydefault(false, false, textView, c25255itK, this.KWHzl.OLrzqt.AEQbTJ, this.KWHzl.OLrzqt.copydefault);
                this.KWHzl.copydefault(false);
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C33054mpH.OLrzqt(context, this.KWHzl.OLrzqt.KWHzl.KWHzl());
                Function1 function1 = this.KWHzl.KWHzl;
                if (function1 != null) {
                    function1.invoke(1);
                }
                Function1 function12 = this.KWHzl.EZpvd;
                if (function12 != null) {
                    function12.invoke(DexTrackEventParameter.ButtonName.MID.getValue());
                }
                C31127loE c31127loE2 = this.KWHzl;
                c31127loE2.copydefault(c31127loE2.AEQbTJ, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.loE$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C31127loE AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C31127loE c31127loE) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c31127loE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C31127loE c31127loE = this.AEQbTJ;
                android.widget.TextView textView = c31127loE.OLrzqt.OLrzqt;
                C25255itK c25255itK = this.AEQbTJ.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c25255itK, "");
                c31127loE.copydefault(false, false, textView, c25255itK, this.AEQbTJ.OLrzqt.AEQbTJ, this.AEQbTJ.OLrzqt.copydefault);
                this.AEQbTJ.copydefault(false);
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C33054mpH.OLrzqt(context, this.AEQbTJ.OLrzqt.KWHzl.KWHzl());
                Function1 function1 = this.AEQbTJ.KWHzl;
                if (function1 != null) {
                    function1.invoke(1);
                }
                Function1 function12 = this.AEQbTJ.EZpvd;
                if (function12 != null) {
                    function12.invoke(DexTrackEventParameter.ButtonName.MID.getValue());
                }
                C31127loE c31127loE2 = this.AEQbTJ;
                c31127loE2.copydefault(c31127loE2.AEQbTJ, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.loE$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C31127loE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C31127loE c31127loE) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c31127loE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C31127loE c31127loE = this.copydefault;
                android.widget.TextView textView = c31127loE.OLrzqt.AEQbTJ;
                C25255itK c25255itK = this.copydefault.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c25255itK, "");
                c31127loE.copydefault(false, false, textView, c25255itK, this.copydefault.OLrzqt.OLrzqt, this.copydefault.OLrzqt.copydefault);
                this.copydefault.copydefault(false);
                android.content.Context context = this.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C33054mpH.OLrzqt(context, this.copydefault.OLrzqt.KWHzl.KWHzl());
                Function1 function1 = this.copydefault.KWHzl;
                if (function1 != null) {
                    function1.invoke(0);
                }
                Function1 function12 = this.copydefault.EZpvd;
                if (function12 != null) {
                    function12.invoke(DexTrackEventParameter.ButtonName.LOW.getValue());
                }
                C31127loE c31127loE2 = this.copydefault;
                c31127loE2.copydefault(c31127loE2.AEQbTJ, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.loE$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ C31127loE AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, C31127loE c31127loE) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c31127loE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C31127loE c31127loE = this.AEQbTJ;
                android.widget.TextView textView = c31127loE.OLrzqt.copydefault;
                C25255itK c25255itK = this.AEQbTJ.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c25255itK, "");
                c31127loE.copydefault(false, false, textView, c25255itK, this.AEQbTJ.OLrzqt.AEQbTJ, this.AEQbTJ.OLrzqt.OLrzqt);
                this.AEQbTJ.copydefault(false);
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C33054mpH.OLrzqt(context, this.AEQbTJ.OLrzqt.KWHzl.KWHzl());
                Function1 function1 = this.AEQbTJ.KWHzl;
                if (function1 != null) {
                    function1.invoke(2);
                }
                Function1 function12 = this.AEQbTJ.EZpvd;
                if (function12 != null) {
                    function12.invoke(DexTrackEventParameter.ButtonName.LOW.getValue());
                }
                C31127loE c31127loE2 = this.AEQbTJ;
                c31127loE2.copydefault(c31127loE2.AEQbTJ, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.loE$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ C31127loE KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C31127loE c31127loE) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c31127loE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C31127loE c31127loE = this.KWHzl;
                android.widget.TextView textView = c31127loE.OLrzqt.AEQbTJ;
                C25255itK c25255itK = this.KWHzl.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c25255itK, "");
                c31127loE.copydefault(false, false, textView, c25255itK, this.KWHzl.OLrzqt.OLrzqt, this.KWHzl.OLrzqt.copydefault);
                this.KWHzl.copydefault(false);
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C33054mpH.OLrzqt(context, this.KWHzl.OLrzqt.KWHzl.KWHzl());
                Function1 function1 = this.KWHzl.KWHzl;
                if (function1 != null) {
                    function1.invoke(0);
                }
                Function1 function12 = this.KWHzl.EZpvd;
                if (function12 != null) {
                    function12.invoke(DexTrackEventParameter.ButtonName.LOW.getValue());
                }
                C31127loE c31127loE2 = this.KWHzl;
                c31127loE2.copydefault(c31127loE2.AEQbTJ, false);
            }
        }
    }

    @Override // o.AbstractC31124loB
    public C55001xbh EZpvd() {
        return this.OLrzqt.KWHzl.KWHzl();
    }

    @Override // o.AbstractC31124loB
    public void setInputEditText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.KWHzl.setEditTextByAuto(str);
    }

    @Override // o.AbstractC31124loB
    public void EZpvd(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt.KWHzl.OLrzqt(function2);
    }

    @Override // o.AbstractC31124loB
    public void AEQbTJ(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt.KWHzl.AEQbTJ(function2);
    }

    @Override // o.AbstractC31124loB
    public boolean KWHzl() {
        return this.OLrzqt.AEQbTJ.isSelected() || this.OLrzqt.OLrzqt.isSelected() || this.OLrzqt.copydefault.isSelected();
    }

    public final void copydefault(boolean z, boolean z2, android.widget.TextView textView, C25255itK c25255itK, android.widget.TextView... textViewArr) {
        if (textView != null) {
            textView.setSelected(false);
        }
        for (android.widget.TextView textView2 : textViewArr) {
            textView2.setSelected(false);
        }
        if (z) {
            c25255itK.setCustomViewBg(true);
            c25255itK.setContentText(java.lang.String.valueOf(c25255itK.KWHzl().getText()), z2);
            return;
        }
        c25255itK.setCustomViewBg(false);
        C25255itK.setContentText$default(c25255itK, null, z2, 1, null);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    @Override // o.AbstractC31124loB
    public void copydefault(@NotNull TransactionType transactionType, boolean z) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        EZpvd(transactionType);
        this.OLrzqt.KWHzl.setUnitVisibility(transactionType, z);
    }

    @Override // o.AbstractC31124loB
    public void setUnitSelectClickListener(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull Function1<? super C55276xgr, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt.KWHzl.setUnitSelectClickListener(fragmentManager, str, str2, str3, new Function0() { // from class: o.loD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31127loE.AhwBna(this.KWHzl);
            }
        }, function1);
    }

    public static final Unit AhwBna(C31127loE c31127loE) {
        C25255itK c25255itK = c31127loE.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c25255itK, "");
        hEK hek = c31127loE.OLrzqt;
        c31127loE.copydefault(true, false, null, c25255itK, hek.AEQbTJ, hek.OLrzqt, hek.copydefault);
        c31127loE.copydefault(true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC31124loB
    public void copydefault() {
        hEK hek = this.OLrzqt;
        android.widget.TextView textView = hek.AEQbTJ;
        C25255itK c25255itK = hek.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c25255itK, "");
        hEK hek2 = this.OLrzqt;
        copydefault(true, false, textView, c25255itK, hek2.OLrzqt, hek2.copydefault);
        copydefault(true);
        this.OLrzqt.KWHzl.setCustomViewBg(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setKeyboardVisibilityListener();
    }

    public final void setKeyboardVisibilityListener() {
        LifecycleOwner lifecycleOwner;
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(getContext());
        if (activityOLrzqt == null || (lifecycleOwner = ViewTreeLifecycleOwner.get(this)) == null) {
            return;
        }
        C59541ziw.EZpvd(activityOLrzqt, lifecycleOwner, new InterfaceC59496ziD() { // from class: o.loG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                C31127loE.setKeyboardVisibilityListener$lambda$11(this.copydefault, z);
            }
        });
    }

    public static final void setKeyboardVisibilityListener$lambda$11(C31127loE c31127loE, boolean z) {
        if (z) {
            return;
        }
        c31127loE.OLrzqt.KWHzl.setCustomViewBg(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(boolean z) {
        this.OLrzqt.djBIcL.setSelected(z);
        C25255itK c25255itK = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c25255itK, "");
        c25255itK.setVisibility(z ? 0 : 8);
    }

    @Override // o.AbstractC31124loB
    public void OLrzqt(int i) {
        hEK hek = this.OLrzqt;
        copydefault(hek.AEQbTJ, hek.OLrzqt, hek.copydefault);
        this.OLrzqt.KWHzl.setCustomViewBg(i == 3);
        AEQbTJ(i).setSelected(true);
        copydefault(i == 3);
    }

    public final android.view.View AEQbTJ(int i) {
        if (i == 0) {
            android.widget.TextView textView = this.OLrzqt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            return textView;
        }
        if (i == 1) {
            android.widget.TextView textView2 = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            return textView2;
        }
        if (i == 2) {
            android.widget.TextView textView3 = this.OLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            return textView3;
        }
        if (i == 3) {
            android.widget.TextView textView4 = this.OLrzqt.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            return textView4;
        }
        android.widget.TextView textView5 = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        return textView5;
    }

    @Override // o.AbstractC31124loB
    public void setUnit(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt.KWHzl.setUnit(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "%") ? UnitType.UnitTypePercent : UnitType.UnitTypeToken, str2);
    }

    @Override // o.AbstractC31124loB
    public UnitType AEQbTJ() {
        return this.OLrzqt.KWHzl.copydefault();
    }

    public final void OLrzqt(TransactionType transactionType) {
        int i;
        int i2;
        int i3 = ActionBar.KWHzl[transactionType.ordinal()];
        if (i3 == 1) {
            i = C23274hvD.ActionBar.valueOf;
            i2 = C23274hvD.StateListAnimator.fIwbmz;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23274hvD.ActionBar.gEmmrt;
            i2 = C23274hvD.StateListAnimator.AuCTel;
        }
        android.widget.TextView textView = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(textView, i, i2);
        android.widget.TextView textView2 = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        AEQbTJ(textView2, i, i2);
        android.widget.TextView textView3 = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        AEQbTJ(textView3, i, i2);
        android.widget.TextView textView4 = this.OLrzqt.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        AEQbTJ(textView4, i, i2);
    }

    public final void AEQbTJ(android.widget.TextView textView, @androidx.annotation.DrawableRes int i, @androidx.annotation.ColorRes int i2) {
        textView.setBackgroundResource(i);
        textView.setTextColor(ContextCompat.getColorStateList(textView.getContext(), i2));
    }

    @Override // o.AbstractC31124loB
    public void setInputEnabled(boolean z) {
        this.OLrzqt.AEQbTJ.setEnabled(z);
        this.OLrzqt.OLrzqt.setEnabled(z);
        this.OLrzqt.copydefault.setEnabled(z);
        this.OLrzqt.djBIcL.setEnabled(z);
        this.OLrzqt.KWHzl.setEnabled(z);
        this.OLrzqt.KWHzl.KWHzl().setEnabled(z);
        this.OLrzqt.KWHzl.setCustomViewBg(z);
        if (z) {
            return;
        }
        this.OLrzqt.AEQbTJ.setSelected(false);
        this.OLrzqt.OLrzqt.setSelected(false);
        this.OLrzqt.copydefault.setSelected(false);
        this.OLrzqt.djBIcL.setSelected(false);
        this.OLrzqt.KWHzl.setSelected(false);
    }

    @Override // o.AbstractC31124loB
    public void setValueTextColor(@androidx.annotation.ColorRes int i) {
        int color = ContextCompat.getColor(getContext(), i);
        this.OLrzqt.AEQbTJ.setTextColor(color);
        this.OLrzqt.OLrzqt.setTextColor(color);
        this.OLrzqt.copydefault.setTextColor(color);
        this.OLrzqt.djBIcL.setTextColor(color);
        this.OLrzqt.KWHzl.KWHzl().setTextColor(color);
    }

    public final void copydefault(android.widget.TextView... textViewArr) {
        for (android.widget.TextView textView : textViewArr) {
            textView.setSelected(false);
        }
    }
}
