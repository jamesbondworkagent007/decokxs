package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55030xcJ;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.xcJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55030xcJ extends ConstraintLayout implements InterfaceC55066xct {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public int AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public LoaderManager AhwBna;
    public final C55065xcs AkhnZx;
    public int DbNXlk;
    public int EZpvd;
    public final C54960xat KWHzl;
    public final C59534zip copydefault;
    public final java.util.ArrayList<java.lang.Object> djBIcL;
    public java.util.Locale fetchVPNInfo;
    public float gEmmrt;
    public boolean valueOf;
    public int values;

    /* JADX INFO: renamed from: o.xcJ$LoaderManager */
    public interface LoaderManager {
        void AEQbTJ();

        void AEQbTJ(char c);

        void KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55030xcJ(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoaderManager KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Locale djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeleteIcon(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEditable(LoaderManager loaderManager) {
        this.AhwBna = loaderManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnable(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItemHeight(float f) {
        this.gEmmrt = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKeyboardBg(int i) {
        this.DbNXlk = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocale(@NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        this.fetchVPNInfo = locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextAppearance(int i) {
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:43) call: o.xcJ.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55030xcJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55030xcJ(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.values = -1;
        this.EZpvd = -1;
        this.DbNXlk = -1;
        this.valueOf = true;
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        this.fetchVPNInfo = locale;
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.AkhnZx = c55065xcs;
        C54960xat c54960xatKWHzl = C54960xat.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54960xatKWHzl, "");
        this.KWHzl = c54960xatKWHzl;
        C59534zip c59534zip = new C59534zip();
        this.copydefault = c59534zip;
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.djBIcL = arrayList;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.xcI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55030xcJ.OLrzqt(context);
            }
        });
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.hGuIrQ);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.values = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.GQzpsZsQwTVT, -1);
            this.EZpvd = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.zXhzOT, -1);
            this.DbNXlk = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.GcnicV, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, 0, 0, 6, null);
        DbNXlk();
        values();
        c54960xatKWHzl.AEQbTJ.setLayoutManager(new GridLayoutManager(context, 3));
        c59534zip.setItems(arrayList);
        c59534zip.register(StateListAnimator.class, new ActionBar());
        c59534zip.register(Application.class, new Activity());
        c54960xatKWHzl.AEQbTJ.setOverScrollMode(2);
    }

    private final java.util.List<java.lang.Character> AYXKKw() {
        return (java.util.List) this.AYXKKw.getValue();
    }

    public static final java.util.List OLrzqt(android.content.Context context) {
        if (C55296xhK.OLrzqt(context)) {
            return yDY.gEmmrt('3', '2', '1', '6', '5', '4', '9', '8', '7', '.', '0', '\b');
        }
        return yDY.gEmmrt('1', '2', '3', '4', '5', '6', '7', '8', '9', '.', '0', '\b');
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.AkhnZx.setOKDSSize(i);
        DbNXlk();
    }

    private final void DbNXlk() {
        ViewGroup.LayoutParams layoutParams = this.KWHzl.AEQbTJ.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        if (this.AkhnZx.copydefault() == -5) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams2.matchConstraintMaxHeight = C55298xhM.OLrzqt(CipherSuite.TLS_PSK_WITH_NULL_SHA256, context);
            layoutParams2.dimensionRatio = "328:176";
            this.AEQbTJ = 0;
        } else {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            layoutParams2.matchConstraintMaxHeight = C55298xhM.OLrzqt(220, context2);
            layoutParams2.dimensionRatio = "328:220";
            this.AEQbTJ = 0;
        }
        this.KWHzl.AEQbTJ.setLayoutParams(layoutParams2);
    }

    private final void values() {
        java.util.Iterator<T> it = AYXKKw().iterator();
        while (it.hasNext()) {
            char cCharValue = ((java.lang.Character) it.next()).charValue();
            if (cCharValue == '\b') {
                this.djBIcL.add(new Application(RequestParameters.SUBRESOURCE_DELETE));
            } else {
                this.djBIcL.add(new StateListAnimator(Web3SecurityTrackEvent.VALUE_INPUT, cCharValue));
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.AEQbTJ == 0) {
            this.AEQbTJ = getMeasuredHeight();
            OLrzqt();
            fetchVPNInfo();
        }
    }

    private final void fetchVPNInfo() {
        this.KWHzl.AEQbTJ.setAdapter(this.copydefault);
    }

    public final void OLrzqt() {
        this.gEmmrt = (float) (((double) this.AEQbTJ) / java.lang.Math.ceil(AYXKKw().size() / 3));
    }

    /* JADX INFO: renamed from: o.xcJ$ActionBar */
    public final class ActionBar extends AbstractC59533zio<StateListAnimator, RecyclerView.ViewHolder> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        /* JADX INFO: renamed from: o.xcJ$ActionBar$Activity */
        public static final class Activity extends RecyclerView.ViewHolder {
            public Activity(AppCompatTextView appCompatTextView) {
                super(appCompatTextView);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
            C55030xcJ c55030xcJ = C55030xcJ.this;
            C55030xcJ.Companion.OLrzqt(appCompatTextView, c55030xcJ.valueOf(), c55030xcJ.copydefault());
            TextViewCompat.setCompoundDrawableTintList(appCompatTextView, android.content.res.ColorStateList.valueOf(ContextCompat.getColor(appCompatTextView.getContext(), C52761wXj.Activity.svhCHd)));
            appCompatTextView.setGravity(17);
            return new Activity(appCompatTextView);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull final StateListAnimator stateListAnimator) {
            java.lang.String strKWHzl;
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            final android.view.View view = viewHolder.itemView;
            final C55030xcJ c55030xcJ = C55030xcJ.this;
            if (view instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) view;
                TextViewCompat.setTextAppearance(textView, c55030xcJ.gEmmrt() != -1 ? c55030xcJ.gEmmrt() : C52761wXj.LoaderManager.AubY);
                if (stateListAnimator.OLrzqt() == '.') {
                    strKWHzl = C38303pTu.EZpvd(c55030xcJ.djBIcL());
                } else {
                    strKWHzl = pTB.KWHzl(C33129mqd.gEmmrt(java.lang.Character.valueOf(stateListAnimator.OLrzqt())), c55030xcJ.djBIcL());
                }
                textView.setText(strKWHzl);
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: o.xcH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C55030xcJ.ActionBar.OLrzqt(c55030xcJ, view, stateListAnimator, view2);
                }
            });
        }

        public static final void OLrzqt(C55030xcJ c55030xcJ, android.view.View view, StateListAnimator stateListAnimator, android.view.View view2) {
            if (c55030xcJ.AhwBna()) {
                view.performHapticFeedback(0, 3);
                LoaderManager loaderManagerKWHzl = c55030xcJ.KWHzl();
                if (loaderManagerKWHzl != null) {
                    loaderManagerKWHzl.AEQbTJ(stateListAnimator.OLrzqt());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.xcJ$Activity */
    public final class Activity extends AbstractC59533zio<Application, RecyclerView.ViewHolder> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX INFO: renamed from: o.xcJ$Activity$Activity, reason: collision with other inner class name */
        public static final class C0997Activity extends RecyclerView.ViewHolder {
            public C0997Activity(wYC wyc) {
                super(wyc);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.content.Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            wYC wyc = new wYC(context, null, 0, 6, null);
            C55030xcJ c55030xcJ = C55030xcJ.this;
            C55030xcJ.Companion.OLrzqt(wyc, c55030xcJ.valueOf(), c55030xcJ.copydefault());
            wyc.setImageResource(c55030xcJ.EZpvd() != -1 ? c55030xcJ.EZpvd() : C52761wXj.TaskDescription.RJOkX);
            wyc.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            return new C0997Activity(wyc);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull Application application) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(application, "");
            final android.view.View view = viewHolder.itemView;
            final C55030xcJ c55030xcJ = C55030xcJ.this;
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.xcG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view2) {
                    return C55030xcJ.Activity.AEQbTJ(c55030xcJ, view2);
                }
            });
            view.setOnClickListener(new View.OnClickListener() { // from class: o.xcO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C55030xcJ.Activity.EZpvd(view, c55030xcJ, view2);
                }
            });
        }

        public static final boolean AEQbTJ(C55030xcJ c55030xcJ, android.view.View view) {
            c55030xcJ.AEQbTJ();
            LoaderManager loaderManagerKWHzl = c55030xcJ.KWHzl();
            if (loaderManagerKWHzl == null) {
                return true;
            }
            loaderManagerKWHzl.KWHzl();
            return true;
        }

        public static final void EZpvd(android.view.View view, C55030xcJ c55030xcJ, android.view.View view2) {
            view.performHapticFeedback(0, 3);
            LoaderManager loaderManagerKWHzl = c55030xcJ.KWHzl();
            if (loaderManagerKWHzl != null) {
                loaderManagerKWHzl.AEQbTJ();
            }
        }
    }

    /* JADX INFO: renamed from: o.xcJ$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String EZpvd;
        public final char KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final char OLrzqt() {
            return this.KWHzl;
        }

        public StateListAnimator(@NotNull java.lang.String str, char c) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.KWHzl = c;
        }
    }

    /* JADX INFO: renamed from: o.xcJ$Application */
    public static final class Application {
        public final java.lang.String OLrzqt;

        public Application(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }

    /* JADX INFO: renamed from: o.xcJ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xcJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void OLrzqt(android.view.View view, int i, float f) {
            if (i != -1) {
                view.setBackground(ContextCompat.getDrawable(view.getContext(), i));
            } else {
                C55279xgu c55279xgu = new C55279xgu();
                c55279xgu.AhwBna(0);
                c55279xgu.AYXKKw(ContextCompat.getColor(view.getContext(), C52761wXj.Activity.GcnicV));
                android.content.Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c55279xgu.OLrzqt(C55298xhM.AEQbTJ(8, context));
                c55279xgu.copydefault(true);
                new C55280xgv().KWHzl(view, c55279xgu);
            }
            view.setLayoutParams(new ConstraintLayout.LayoutParams(-1, (int) f));
        }
    }
}
