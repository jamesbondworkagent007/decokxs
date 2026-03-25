package o;

import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.ColorUtils;
import com.okinc.im.imui.widgets.FileMessageState;
import com.okinc.okimcore.model.im.OKFileMessage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37728ozM extends android.widget.FrameLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final C34037nPb AEQbTJ;
    public int KWHzl;
    public Function0<Unit> OLrzqt;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.ozM$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FileMessageState.values().length];
            try {
                iArr[FileMessageState.UPLOADING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FileMessageState.UPLOAD_CANCELLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FileMessageState.UPLOAD_FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[FileMessageState.SENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[FileMessageState.PENDING_DOWNLOAD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[FileMessageState.DOWNLOADING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[FileMessageState.DOWNLOAD_FAILED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[FileMessageState.DOWNLOADED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37728ozM(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37728ozM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnActionClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.ozM.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C37728ozM(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37728ozM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C34037nPb c34037nPbOLrzqt = C34037nPb.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c34037nPbOLrzqt, "");
        this.AEQbTJ = c34037nPbOLrzqt;
        c34037nPbOLrzqt.copydefault.AEQbTJ().setVisibility(8);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.ozV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37728ozM.EZpvd(this.KWHzl, view);
            }
        };
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: o.ozR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C37728ozM.AEQbTJ(this.EZpvd, view);
            }
        };
        c34037nPbOLrzqt.copydefault.setOnClickListener(onClickListener);
        c34037nPbOLrzqt.copydefault.setOnLongClickListener(onLongClickListener);
        c34037nPbOLrzqt.OLrzqt.setOnClickListener(onClickListener);
        c34037nPbOLrzqt.OLrzqt.setOnLongClickListener(onLongClickListener);
        c34037nPbOLrzqt.valueOf.setOnClickListener(onClickListener);
        c34037nPbOLrzqt.valueOf.setOnLongClickListener(onLongClickListener);
        c34037nPbOLrzqt.djBIcL.setOnClickListener(onClickListener);
        c34037nPbOLrzqt.djBIcL.setOnLongClickListener(onLongClickListener);
    }

    public static final void EZpvd(C37728ozM c37728ozM, android.view.View view) {
        Function0<Unit> function0 = c37728ozM.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final boolean AEQbTJ(C37728ozM c37728ozM, android.view.View view) {
        java.lang.Object parent = c37728ozM.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        return view2 != null && view2.performLongClick();
    }

    public final void AEQbTJ(@NotNull OKFileMessage oKFileMessage, @NotNull FileMessageState fileMessageState) {
        Intrinsics.checkNotNullParameter(oKFileMessage, "");
        Intrinsics.checkNotNullParameter(fileMessageState, "");
        android.widget.TextView textView = this.AEQbTJ.valueOf;
        java.lang.String fileName = oKFileMessage.getFileName();
        if (fileName == null) {
            fileName = getContext().getString(C35399nuc.LoaderManager.QhsCdEQhsCdE);
            Intrinsics.checkNotNullExpressionValue(fileName, "");
        }
        textView.setText(fileName);
        this.AEQbTJ.djBIcL.setText(Companion.KWHzl(oKFileMessage.getFileSize()));
        EZpvd(fileMessageState);
    }

    public final void AEQbTJ(boolean z) {
        int iOLrzqt;
        if (z) {
            int i = C52761wXj.Activity.zblBkD;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iOLrzqt = C33070mpX.OLrzqt(i, context);
            this.AEQbTJ.valueOf.setTextColor(iOLrzqt);
            android.widget.TextView textView = this.AEQbTJ.djBIcL;
            int i2 = C52761wXj.Activity.WS;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textView.setTextColor(C33070mpX.OLrzqt(i2, context2));
        } else {
            int i3 = C52761wXj.Activity.fdOvFl;
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            iOLrzqt = C33070mpX.OLrzqt(i3, context3);
            this.AEQbTJ.valueOf.setTextColor(iOLrzqt);
            android.widget.TextView textView2 = this.AEQbTJ.djBIcL;
            int i4 = C52761wXj.Activity.DCUTEIddSDPG;
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            textView2.setTextColor(C33070mpX.OLrzqt(i4, context4));
        }
        wYB.setTintColor$default(this.AEQbTJ.copydefault, iOLrzqt, iOLrzqt, 0, 4, null);
        this.KWHzl = iOLrzqt;
        this.AEQbTJ.EZpvd.setIndicatorColor(iOLrzqt);
        this.AEQbTJ.EZpvd.setTrackColor(ColorUtils.setAlphaComponent(iOLrzqt, 51));
    }

    public final void setTransferProgress(long j, long j2) {
        android.widget.TextView textView = this.AEQbTJ.djBIcL;
        ActionBar actionBar = Companion;
        textView.setText(actionBar.KWHzl(java.lang.Long.valueOf(j)) + " / " + actionBar.KWHzl(java.lang.Long.valueOf(j2)));
        if (j2 > 0) {
            this.AEQbTJ.EZpvd.setProgress((int) ((j * 100) / j2));
        }
    }

    public final void setFillWidth() {
        if (this.copydefault) {
            return;
        }
        this.copydefault = true;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -1;
        setLayoutParams(layoutParams);
        this.AEQbTJ.getRoot().setMaxWidth(Integer.MAX_VALUE);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.copydefault || getChildCount() == 0) {
            return;
        }
        android.view.View childAt = getChildAt(0);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (childAt.getMeasuredWidth() < measuredWidth) {
            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
        }
    }

    public final void EZpvd(FileMessageState fileMessageState) {
        switch (Activity.copydefault[fileMessageState.ordinal()]) {
            case 1:
                KWHzl(true, false);
                return;
            case 2:
                copydefault(C52761wXj.TaskDescription.QKVWgx);
                return;
            case 3:
                copydefault(C52761wXj.TaskDescription.QKVWgx);
                return;
            case 4:
                copydefault(C52761wXj.TaskDescription.DzCpqu);
                return;
            case 5:
                copydefault(C52761wXj.TaskDescription.DrNnAm);
                return;
            case 6:
                KWHzl(true, false);
                return;
            case 7:
                copydefault(C52761wXj.TaskDescription.DrNnAm);
                return;
            case 8:
                copydefault(C52761wXj.TaskDescription.DzCpqu);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void copydefault(int i) {
        wYB wyb = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(wyb, "");
        wyb.setVisibility(0);
        this.AEQbTJ.copydefault.OLrzqt().setImageResource(i);
        android.widget.FrameLayout frameLayout = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        this.AEQbTJ.EZpvd.hide();
    }

    public final void KWHzl(boolean z, boolean z2) {
        wYB wyb = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(wyb, "");
        wyb.setVisibility(8);
        android.widget.FrameLayout frameLayout = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(0);
        this.AEQbTJ.EZpvd.setIndeterminate(z2);
        if (!z2) {
            this.AEQbTJ.EZpvd.setProgress(0);
        }
        this.AEQbTJ.EZpvd.show();
        android.widget.ImageView imageView = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
        if (z) {
            this.AEQbTJ.KWHzl.setImageResource(C52761wXj.TaskDescription.alsFma);
            int i = this.KWHzl;
            if (i != 0) {
                this.AEQbTJ.KWHzl.setImageTintList(android.content.res.ColorStateList.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: o.ozM$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ozM.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.String KWHzl(java.lang.Long l) {
            if (l == null || l.longValue() < 0) {
                return "";
            }
            if (l.longValue() < 1024) {
                return l + " B";
            }
            if (l.longValue() < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                C56529yIt c56529yIt = C56529yIt.KWHzl;
                java.lang.String str = java.lang.String.format(java.util.Locale.ROOT, "%.1f KB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(l.longValue() / 1024)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }
            if (l.longValue() < 1073741824) {
                C56529yIt c56529yIt2 = C56529yIt.KWHzl;
                java.lang.String str2 = java.lang.String.format(java.util.Locale.ROOT, "%.1f MB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(l.longValue() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "");
                return str2;
            }
            C56529yIt c56529yIt3 = C56529yIt.KWHzl;
            java.lang.String str3 = java.lang.String.format(java.util.Locale.ROOT, "%.1f GB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(l.longValue() / 1073741824)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            return str3;
        }
    }
}
