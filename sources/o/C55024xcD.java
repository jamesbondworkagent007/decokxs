package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55024xcD extends ConstraintLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public java.lang.CharSequence AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public final C55065xcs AkhnZx;
    public android.widget.ImageView DbNXlk;
    public final C55023xcC EZpvd;
    public final C54917xaC OLrzqt;
    public final int copydefault;
    public boolean djBIcL;
    public int fJNWhG;
    public java.lang.CharSequence fetchVPNInfo;
    public boolean gEmmrt;
    public java.lang.CharSequence isConnected;
    public final Activity valueOf;
    public C55251xgS values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55024xcD(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55024xcD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.xcD.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55024xcD(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55024xcD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        C55320xhi c55320xhiKWHzl;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.fetchVPNInfo = "";
        this.AEQbTJ = "";
        this.isConnected = "";
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.AkhnZx = c55065xcs;
        C54917xaC c54917xaCCopydefault = C54917xaC.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54917xaCCopydefault, "");
        this.OLrzqt = c54917xaCCopydefault;
        C55023xcC c55023xcC = new C55023xcC(this);
        this.EZpvd = c55023xcC;
        this.AYXKKw = true;
        this.copydefault = ContextCompat.getColor(context, C52761wXj.Activity.QwvEab);
        Activity activity = new Activity();
        this.valueOf = activity;
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C52761wXj.Fragment.RKDWNf, (android.view.ViewGroup) c54917xaCCopydefault.AYXKKw, false);
        this.values = (C55251xgS) viewInflate.findViewById(C52761wXj.FragmentManager.gEmmrt);
        this.DbNXlk = (android.widget.ImageView) viewInflate.findViewById(C52761wXj.FragmentManager.KWHzl);
        c54917xaCCopydefault.AYXKKw.setAttachingView(viewInflate);
        C55312xha c55312xhaValueOf = c54917xaCCopydefault.AYXKKw.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setMovementMethod(activity);
        }
        android.widget.FrameLayout frameLayout = c54917xaCCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        C55296xhK.EZpvd((android.view.View) frameLayout, C55298xhM.OLrzqt(44, context));
        c54917xaCCopydefault.AYXKKw.setTextWeight$OKUILib_uilib(TypedValues.TransitionType.TYPE_DURATION);
        c55023xcC.OLrzqt(attributeSet, i, C52761wXj.LoaderManager.dvKsVJ);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, 0, 0, 6, null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.iRgjgR);
        setType(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.sEAkxl, 0));
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.HrFqwD);
        setTitleText(string == null ? "" : string);
        setShowDescription(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.DGgkXd, false));
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.geAOna);
        setDescriptionText(string2 == null ? "" : string2);
        setShowTitleTag(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.DpxfQh, false));
        java.lang.String string3 = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.OqCbbx);
        setTitleTagText(string3 != null ? string3 : "");
        setShowTitleIcon(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.HJWChPzRXNTw, false));
        typedArrayObtainStyledAttributes.recycle();
        setSize(c55065xcs.copydefault());
    }

    public final void setSize(int i) {
        this.AkhnZx.setOKDSSize(i);
        KWHzl();
    }

    public final void setType(int i) {
        this.fJNWhG = i;
        copydefault();
    }

    public final void setTitleText(java.lang.CharSequence charSequence) {
        C55320xhi c55320xhiKWHzl;
        this.fetchVPNInfo = charSequence;
        C55312xha c55312xhaValueOf = this.OLrzqt.AYXKKw.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(charSequence);
    }

    public final void setShowDescription(boolean z) {
        this.AhwBna = z;
        this.OLrzqt.AEQbTJ.setVisibility(z ? 0 : 8);
    }

    public final void setDescriptionText(java.lang.CharSequence charSequence) {
        this.AEQbTJ = charSequence;
        this.OLrzqt.AEQbTJ.setText(charSequence);
    }

    public final void setShowTitleTag(boolean z) {
        this.gEmmrt = z;
        C55251xgS c55251xgS = this.values;
        if (c55251xgS != null) {
            c55251xgS.setVisibility(z ? 0 : 8);
        }
    }

    public final void setTitleTagText(java.lang.CharSequence charSequence) {
        this.isConnected = charSequence;
        C55251xgS c55251xgS = this.values;
        if (c55251xgS != null) {
            c55251xgS.setText(charSequence);
        }
    }

    public final void setShowTitleIcon(boolean z) {
        this.djBIcL = z;
        android.widget.ImageView imageView = this.DbNXlk;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void setTitleIconOnClickListener(@NotNull final View.OnClickListener onClickListener) {
        final C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        C55312xha c55312xhaValueOf = this.OLrzqt.AYXKKw.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setAttachClickListener(new Function0() { // from class: o.xcE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55024xcD.AEQbTJ(onClickListener, c55320xhiKWHzl);
            }
        });
    }

    public static final Unit AEQbTJ(View.OnClickListener onClickListener, C55320xhi c55320xhi) {
        onClickListener.onClick(c55320xhi);
        return Unit.INSTANCE;
    }

    public final void setIconOnClickListener(View.OnClickListener onClickListener) {
        this.OLrzqt.EZpvd.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: o.xcF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C55024xcD.setOnClickListener$lambda$2(this.AEQbTJ, onClickListener, view);
            }
        });
    }

    public static final void setOnClickListener$lambda$2(C55024xcD c55024xcD, View.OnClickListener onClickListener, android.view.View view) {
        if (c55024xcD.fJNWhG == 2) {
            boolean z = !c55024xcD.AYXKKw;
            c55024xcD.AYXKKw = z;
            if (z) {
                c55024xcD.OLrzqt.EZpvd.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
            } else {
                c55024xcD.OLrzqt.EZpvd.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
            }
        }
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: o.xcD$Activity */
    public static final class Activity extends android.text.method.BaseMovementMethod {
        @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
        public boolean onTouchEvent(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(spannable, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0 || action == 1) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int totalPaddingLeft = textView.getTotalPaddingLeft();
                int totalPaddingTop = textView.getTotalPaddingTop();
                int scrollX = textView.getScrollX();
                int scrollY = textView.getScrollY();
                android.text.Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((y - totalPaddingTop) + scrollY), (x - totalPaddingLeft) + scrollX);
                android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
                Intrinsics.copydefault(clickableSpanArr);
                if (!(clickableSpanArr.length == 0)) {
                    android.text.style.ClickableSpan clickableSpan = clickableSpanArr[0];
                    if (action == 1) {
                        clickableSpan.onClick(textView);
                    }
                    return true;
                }
                C55024xcD c55024xcDOLrzqt = OLrzqt(textView);
                if (action == 0 && c55024xcDOLrzqt != null && c55024xcDOLrzqt.hasOnClickListeners()) {
                    c55024xcDOLrzqt.setPressed(true);
                }
                if (action == 1 && c55024xcDOLrzqt != null && c55024xcDOLrzqt.hasOnClickListeners()) {
                    c55024xcDOLrzqt.setPressed(false);
                    c55024xcDOLrzqt.performClick();
                }
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        }

        public final C55024xcD OLrzqt(android.view.View view) {
            android.view.ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof C55024xcD)) {
                parent = parent.getParent();
            }
            if (parent instanceof C55024xcD) {
                return (C55024xcD) parent;
            }
            return null;
        }
    }

    public final void copydefault() {
        C54917xaC c54917xaC = this.OLrzqt;
        if (this.fJNWhG == 0) {
            c54917xaC.KWHzl.setVisibility(8);
        } else {
            c54917xaC.KWHzl.setVisibility(0);
            if (this.fJNWhG == 4) {
                c54917xaC.copydefault.setVisibility(0);
                c54917xaC.EZpvd.setVisibility(8);
            } else {
                c54917xaC.copydefault.setVisibility(8);
                c54917xaC.EZpvd.setVisibility(0);
            }
        }
        int i = this.fJNWhG;
        if (i == 1) {
            c54917xaC.EZpvd.setImageResource(C52761wXj.TaskDescription.DGUQLI);
        } else if (i == 2) {
            c54917xaC.EZpvd.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
        } else {
            if (i != 3) {
                return;
            }
            c54917xaC.EZpvd.setImageResource(C52761wXj.TaskDescription.dPnHjp);
        }
    }

    public final void KWHzl() {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        C55320xhi c55320xhiKWHzl3;
        int iCopydefault = this.AkhnZx.copydefault();
        if (iCopydefault == -5) {
            this.OLrzqt.AYXKKw.setTextAppearance(this.EZpvd.AhwBna());
            C55312xha c55312xhaValueOf = this.OLrzqt.AYXKKw.valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c55320xhiKWHzl.setLineHeight(C55298xhM.djBIcL(16.0f, context));
            }
            C55251xgS c55251xgS = this.values;
            if (c55251xgS != null) {
                c55251xgS.setOKDSSize(-5);
            }
            android.widget.TextView textView = this.OLrzqt.AEQbTJ;
            textView.setTextAppearance(this.EZpvd.djBIcL());
            textView.setTextColor(this.copydefault);
            android.widget.ImageView imageView = this.OLrzqt.EZpvd;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = this.EZpvd.gEmmrt();
            layoutParams.height = this.EZpvd.gEmmrt();
            imageView.setLayoutParams(layoutParams);
            return;
        }
        if (iCopydefault == -4) {
            this.OLrzqt.AYXKKw.setTextAppearance(this.EZpvd.valueOf());
            C55312xha c55312xhaValueOf2 = this.OLrzqt.AYXKKw.valueOf();
            if (c55312xhaValueOf2 != null && (c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl()) != null) {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c55320xhiKWHzl2.setLineHeight(C55298xhM.djBIcL(24.0f, context2));
            }
            C55251xgS c55251xgS2 = this.values;
            if (c55251xgS2 != null) {
                c55251xgS2.setOKDSSize(-5);
            }
            android.widget.TextView textView2 = this.OLrzqt.AEQbTJ;
            textView2.setTextAppearance(this.EZpvd.EZpvd());
            textView2.setTextColor(this.copydefault);
            android.widget.ImageView imageView2 = this.OLrzqt.EZpvd;
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            layoutParams2.width = this.EZpvd.AEQbTJ();
            layoutParams2.height = this.EZpvd.AEQbTJ();
            imageView2.setLayoutParams(layoutParams2);
            return;
        }
        if (iCopydefault != -3) {
            return;
        }
        this.OLrzqt.AYXKKw.setTextAppearance(this.EZpvd.copydefault());
        C55312xha c55312xhaValueOf3 = this.OLrzqt.AYXKKw.valueOf();
        if (c55312xhaValueOf3 != null && (c55320xhiKWHzl3 = c55312xhaValueOf3.KWHzl()) != null) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c55320xhiKWHzl3.setLineHeight(C55298xhM.djBIcL(28.0f, context3));
        }
        C55251xgS c55251xgS3 = this.values;
        if (c55251xgS3 != null) {
            c55251xgS3.setOKDSSize(-4);
        }
        android.widget.TextView textView3 = this.OLrzqt.AEQbTJ;
        textView3.setTextAppearance(this.EZpvd.OLrzqt());
        textView3.setTextColor(this.copydefault);
        android.widget.ImageView imageView3 = this.OLrzqt.EZpvd;
        ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
        layoutParams3.width = this.EZpvd.KWHzl();
        layoutParams3.height = this.EZpvd.KWHzl();
        imageView3.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: o.xcD$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xcD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
