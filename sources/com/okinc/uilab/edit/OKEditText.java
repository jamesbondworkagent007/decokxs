package com.okinc.uilab.edit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.appcompat.R;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import com.okinc.uilab.edit.OKEditText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55298xhM;
import o.C55307xhV;
import o.C55366xib;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class OKEditText extends AppCompatEditText {

    @Deprecated
    public static final int DEFAULT_PADDING = 0;

    @Deprecated
    public static final int VERY_WIDE = 1048576;
    private boolean autoScale;
    private int currentTextSize;
    private final InterfaceC56387yDm cursorDrawable$delegate;
    private final InterfaceC56387yDm cursorRunnable$delegate;
    private OKEditTextCursorStyle cursorStyle;
    private final Activity cursorWatcher;
    private final TaskDescription enlargeListener;
    private boolean fallback;
    private int hintTextSize;
    private int mCursorDuration;
    private final InterfaceC56387yDm mTempRect$delegate;
    private int maxTextSize;
    private int minTextSize;
    private final StateListAnimator narrowListener;
    private int narrowTextSize;
    private int preTextLength;
    private TextWatcher scaleTextWatcher;
    private boolean showCursor;
    private static final Application Companion = new Application(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKEditText(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKEditText(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getAutoScale() {
        return this.autoScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKEditTextCursorStyle getCursorStyle() {
        return this.cursorStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHintTextSize() {
        return this.hintTextSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxTextSize() {
        return this.maxTextSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMinTextSize() {
        return this.minTextSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNarrowTextSize() {
        return this.narrowTextSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextWatcher getScaleTextWatcher$OKUILib_uilib() {
        return this.scaleTextWatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxTextSize(int i) {
        this.maxTextSize = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinTextSize(int i) {
        this.minTextSize = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNarrowTextSize(int i) {
        this.narrowTextSize = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScaleTextWatcher$OKUILib_uilib(@NotNull TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "");
        this.scaleTextWatcher = textWatcher;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] androidx.appcompat.R.attr.editTextStyle int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: com.okinc.uilab.edit.OKEditText.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OKEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKEditText(@NotNull final Context context, AttributeSet attributeSet, int i) {
        super(Companion.OLrzqt(context, C52761wXj.ActionBar.fjfviF), attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.hintTextSize = 14;
        this.maxTextSize = 14;
        this.minTextSize = 12;
        this.narrowTextSize = 2;
        this.scaleTextWatcher = new LoaderManager();
        this.narrowListener = new StateListAnimator();
        this.enlargeListener = new TaskDescription();
        OKEditTextCursorStyle oKEditTextCursorStyle = OKEditTextCursorStyle.SYSTEM;
        this.cursorStyle = oKEditTextCursorStyle;
        this.cursorDrawable$delegate = C56392yDr.copydefault(new Function0() { // from class: o.xbj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKEditText.cursorDrawable_delegate$lambda$0(context);
            }
        });
        this.cursorRunnable$delegate = C56392yDr.copydefault(new Function0() { // from class: o.xbk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKEditText.cursorRunnable_delegate$lambda$1(this.AEQbTJ);
            }
        });
        this.mCursorDuration = 500;
        this.cursorWatcher = new Activity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.RuDPQV);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setAutoScale(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.aCSzUz, false));
        this.minTextSize = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.aVhqwO, 12);
        this.narrowTextSize = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.dIjzlO, 2);
        setHintTextSize(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.dPnHjp, -1));
        int integer = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.atDTRm, 0);
        if (integer != 0 && integer == 1) {
            oKEditTextCursorStyle = OKEditTextCursorStyle.WEB3;
        }
        setCursorStyle(oKEditTextCursorStyle);
        typedArrayObtainStyledAttributes.recycle();
        if (this.hintTextSize != -1) {
            setHintTextSize(getHint(), this.hintTextSize);
        }
        if (getAutoScale()) {
            addTextChangedListener(this.scaleTextWatcher);
        }
        this.mTempRect$delegate = C56392yDr.copydefault(new Function0() { // from class: o.xbm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKEditText.mTempRect_delegate$lambda$4();
            }
        });
    }

    public final void setHintTextSize(int i) {
        this.hintTextSize = i;
        setHintTextSize(getHint(), this.hintTextSize);
    }

    public void setAutoScale(boolean z) {
        this.autoScale = z;
        if (z) {
            addTextChangedListener(this.scaleTextWatcher);
        } else {
            removeTextChangedListener(this.scaleTextWatcher);
        }
    }

    public static final class LoaderManager implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public LoaderManager() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!OKEditText.this.getAutoScale()) {
                OKEditText.this.preTextLength = editable != null ? editable.length() : 0;
                return;
            }
            if (TextUtils.isEmpty(editable)) {
                if (OKEditText.this.preTextLength > 0) {
                    OKEditText.this.getViewTreeObserver().addOnPreDrawListener(OKEditText.this.enlargeListener);
                }
            } else {
                Intrinsics.copydefault(editable);
                if (editable.length() < OKEditText.this.preTextLength) {
                    OKEditText.this.getViewTreeObserver().addOnPreDrawListener(OKEditText.this.enlargeListener);
                } else {
                    OKEditText.this.getViewTreeObserver().addOnPreDrawListener(OKEditText.this.narrowListener);
                }
            }
            OKEditText.this.preTextLength = editable != null ? editable.length() : 0;
        }
    }

    public static final class StateListAnimator implements ViewTreeObserver.OnPreDrawListener {
        public StateListAnimator() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            TextPaint paint = OKEditText.this.getPaint();
            Editable text = OKEditText.this.getText();
            float fMeasureText = paint.measureText(text != null ? text.toString() : null);
            if (OKEditText.this.getWidth() > 0 && fMeasureText > OKEditText.this.getWidth() && OKEditText.this.currentTextSize > OKEditText.this.getMinTextSize()) {
                OKEditText.this.currentTextSize -= OKEditText.this.getNarrowTextSize();
                OKEditText.this.setTextSize(r0.currentTextSize);
                return false;
            }
            OKEditText.this.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    public static final class TaskDescription implements ViewTreeObserver.OnPreDrawListener {
        public TaskDescription() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int maxTextSize;
            TextPaint paint = OKEditText.this.getPaint();
            Editable text = OKEditText.this.getText();
            float fMeasureText = paint.measureText(text != null ? text.toString() : null);
            if (fMeasureText > OKEditText.this.getWidth()) {
                OKEditText.this.getViewTreeObserver().removeOnPreDrawListener(this);
                OKEditText.this.getViewTreeObserver().addOnPreDrawListener(OKEditText.this.narrowListener);
            }
            if (fMeasureText < OKEditText.this.getWidth() && OKEditText.this.currentTextSize < OKEditText.this.getMaxTextSize()) {
                OKEditText.this.currentTextSize += OKEditText.this.getNarrowTextSize();
                OKEditText oKEditText = OKEditText.this;
                if (oKEditText.currentTextSize < OKEditText.this.getMaxTextSize()) {
                    maxTextSize = OKEditText.this.currentTextSize;
                } else {
                    maxTextSize = OKEditText.this.getMaxTextSize();
                }
                oKEditText.setTextSize(maxTextSize);
                return false;
            }
            OKEditText.this.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    private final void setCursorStyle(OKEditTextCursorStyle oKEditTextCursorStyle) {
        if (this.cursorStyle != oKEditTextCursorStyle) {
            this.cursorStyle = oKEditTextCursorStyle;
            if (oKEditTextCursorStyle == OKEditTextCursorStyle.WEB3) {
                setCursorVisible(false);
                C55307xhV.copydefault(this, ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.ahrCSq));
                setCursorVisible(true);
                this.showCursor = true;
                cursorBlink();
                return;
            }
            cancelBlink();
        }
    }

    private final Drawable getCursorDrawable() {
        return (Drawable) this.cursorDrawable$delegate.getValue();
    }

    public static final Drawable cursorDrawable_delegate$lambda$0(Context context) {
        return ContextCompat.getDrawable(context, C52761wXj.TaskDescription.sanitizeSessionIdIgnoreCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionBar getCursorRunnable() {
        return (ActionBar) this.cursorRunnable$delegate.getValue();
    }

    public static final ActionBar cursorRunnable_delegate$lambda$1(OKEditText oKEditText) {
        return oKEditText.new ActionBar();
    }

    public static final class Activity implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            OKEditText oKEditText = OKEditText.this;
            oKEditText.removeCallbacks(oKEditText.getCursorRunnable());
            OKEditText oKEditText2 = OKEditText.this;
            oKEditText2.postDelayed(oKEditText2.getCursorRunnable(), OKEditText.this.mCursorDuration);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            OKEditText oKEditText = OKEditText.this;
            oKEditText.removeCallbacks(oKEditText.getCursorRunnable());
            OKEditText.this.showCursor = true;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        float textSize = getTextSize();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iAhwBna = C55298xhM.AhwBna(textSize, context);
        this.maxTextSize = iAhwBna;
        this.currentTextSize = iAhwBna;
        if (isWeb3CursorStyle()) {
            cursorBlink();
        }
    }

    public final void setHintText(CharSequence charSequence) {
        setHint(charSequence);
        setHintTextSize(charSequence, this.hintTextSize);
    }

    public final void setCursorStyleWeb3() {
        if (isWeb3CursorStyle()) {
            return;
        }
        setCursorStyle(OKEditTextCursorStyle.WEB3);
    }

    public final boolean isWeb3CursorStyle() {
        return this.cursorStyle == OKEditTextCursorStyle.WEB3;
    }

    public final void disableKeyboard() {
        setKeyListener(null);
        setShowSoftInputOnFocus(false);
    }

    public final void setHintTextSize(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        getViewTreeObserver().addOnPreDrawListener(new Fragment(charSequence, new int[]{i}));
    }

    public static final class Fragment implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ CharSequence AEQbTJ;
        public final /* synthetic */ int[] OLrzqt;

        public Fragment(CharSequence charSequence, int[] iArr) {
            this.AEQbTJ = charSequence;
            this.OLrzqt = iArr;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            float fMeasureText = OKEditText.this.getPaint().measureText(String.valueOf(this.AEQbTJ));
            float paddingStart = OKEditText.this.getPaddingStart();
            float paddingEnd = OKEditText.this.getPaddingEnd();
            if (OKEditText.this.getPaint().measureText(String.valueOf(this.AEQbTJ)) > OKEditText.this.getWidth() && this.OLrzqt[0] > OKEditText.this.getMinTextSize()) {
                int[] iArr = this.OLrzqt;
                iArr[0] = iArr[0] - OKEditText.this.getNarrowTextSize();
                SpannableString spannableString = new SpannableString(this.AEQbTJ);
                spannableString.setSpan(new AbsoluteSizeSpan(this.OLrzqt[0], true), 0, spannableString.length(), 33);
                OKEditText.this.setHint(new SpannedString(spannableString));
            } else {
                OKEditText.this.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            OKEditText oKEditText = OKEditText.this;
            oKEditText.setEllipsize((fMeasureText + paddingStart) + paddingEnd > ((float) oKEditText.getWidth()) ? TextUtils.TruncateAt.END : null);
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OKEditTextCursorStyle {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ OKEditTextCursorStyle[] $VALUES;
        public static final OKEditTextCursorStyle SYSTEM = new OKEditTextCursorStyle("SYSTEM", 0, 0);
        public static final OKEditTextCursorStyle WEB3 = new OKEditTextCursorStyle("WEB3", 1, 1);
        private final int styleInt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ OKEditTextCursorStyle[] $values() {
            return new OKEditTextCursorStyle[]{SYSTEM, WEB3};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<OKEditTextCursorStyle> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getStyleInt() {
            return this.styleInt;
        }

        private OKEditTextCursorStyle(String str, int i, int i2) {
            this.styleInt = i2;
        }

        static {
            OKEditTextCursorStyle[] oKEditTextCursorStyleArr$values = $values();
            $VALUES = oKEditTextCursorStyleArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(oKEditTextCursorStyleArr$values);
        }

        public static OKEditTextCursorStyle valueOf(String str) {
            return (OKEditTextCursorStyle) Enum.valueOf(OKEditTextCursorStyle.class, str);
        }

        public static OKEditTextCursorStyle[] values() {
            return (OKEditTextCursorStyle[]) $VALUES.clone();
        }
    }

    public final void cursorBlink() {
        cancelBlink();
        postDelayed(getCursorRunnable(), this.mCursorDuration);
        addTextChangedListener(this.cursorWatcher);
    }

    public final void cancelBlink() {
        removeCallbacks(getCursorRunnable());
        removeTextChangedListener(this.cursorWatcher);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        cancelBlink();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        int iSave = canvas.save();
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        try {
            drawCursor(canvas);
        } catch (Exception e) {
            pUU.EZpvd("OKEditText", "draw cursor error: " + e.getMessage());
            useFallbackCursor();
        }
    }

    public final void useFallbackCursor() {
        if (this.fallback) {
            return;
        }
        this.fallback = true;
        setCursorStyle(OKEditTextCursorStyle.SYSTEM);
        C55307xhV.copydefault(this, ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.validateSHA256));
    }

    public final void drawCursor(Canvas canvas) {
        Drawable cursorDrawable;
        if (!hasFocus() || !this.showCursor || hasSelection() || (cursorDrawable = getCursorDrawable()) == null) {
            return;
        }
        int selectionStart = getSelectionStart();
        Layout layout = getLayout();
        Intrinsics.checkNotNullExpressionValue(layout, "");
        int lineForOffset = layout.getLineForOffset(selectionStart);
        int lineTop = layout.getLineTop(lineForOffset) + getPaddingTop();
        int lineBottom = layout.getLineBottom(lineForOffset) + getPaddingTop();
        if (getMaxLines() == 1 && (getGravity() & 16) == 16) {
            int height = (((getHeight() - (layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset))) - getPaddingTop()) - getPaddingBottom()) / 2;
            lineTop += height;
            lineBottom += height;
        }
        updateCursorPosition(lineTop, lineBottom, layout.getPrimaryHorizontal(selectionStart));
        cursorDrawable.draw(canvas);
    }

    private final Rect getMTempRect() {
        return (Rect) this.mTempRect$delegate.getValue();
    }

    public static final Rect mTempRect_delegate$lambda$4() {
        return new Rect();
    }

    public final int clampHorizontalPosition(Drawable drawable, float f) {
        int intrinsicWidth;
        float fMax = (float) Math.max(0.5d, f - 0.5f);
        if (drawable != null) {
            drawable.getPadding(getMTempRect());
            intrinsicWidth = drawable.getIntrinsicWidth();
        } else {
            getMTempRect().setEmpty();
            intrinsicWidth = 0;
        }
        int scrollX = getScrollX();
        float f2 = fMax - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f3 = width;
        if (f2 >= f3 - 1.0f) {
            return (width + scrollX) - (intrinsicWidth - getMTempRect().right);
        }
        if (Math.abs(f2) <= 1.0d || (TextUtils.isEmpty(getText()) && 1048576 - scrollX <= f3 + 1.0f && fMax <= 1.0f)) {
            return scrollX - getMTempRect().left;
        }
        return ((int) fMax) - getMTempRect().left;
    }

    public final void updateCursorPosition(int i, int i2, float f) {
        Drawable cursorDrawable = getCursorDrawable();
        if (cursorDrawable != null) {
            int iClampHorizontalPosition = clampHorizontalPosition(cursorDrawable, f) + getPaddingLeft();
            cursorDrawable.setBounds(iClampHorizontalPosition, (i - getMTempRect().top) + 6, cursorDrawable.getIntrinsicWidth() + iClampHorizontalPosition + 2, (i2 + getMTempRect().bottom) - 2);
        }
    }

    public final class ActionBar implements Runnable {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OKEditText.this.showCursor = !r0.showCursor;
            OKEditText.this.invalidate();
            OKEditText oKEditText = OKEditText.this;
            oKEditText.postDelayed(oKEditText.getCursorRunnable(), OKEditText.this.mCursorDuration);
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.edit.OKEditText.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final Context OLrzqt(@NotNull Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            return new ContextThemeWrapper(context, C55366xib.OLrzqt(i, context));
        }
    }
}
