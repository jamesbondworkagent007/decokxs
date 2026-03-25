package o;

import android.graphics.Color;
import android.text.TextUtils;
import com.immomo.mls.fun.ud.view.UDEditText;
import o.InterfaceC7383aim;

/* JADX INFO: renamed from: o.alh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7537alh extends C7811aqq implements InterfaceC7383aim<UDEditText> {
    public InterfaceC7383aim.ActionBar AEQbTJ;
    public Activity EZpvd;
    public UDEditText copydefault;

    /* JADX INFO: renamed from: o.alh$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public interface Activity {
        void EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public UDEditText getUserdata() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnBackspaceDownListener(Activity activity) {
        this.EZpvd = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.AEQbTJ = actionBar;
    }

    public C7537alh(android.content.Context context, UDEditText uDEditText) {
        super(context);
        this.copydefault = uDEditText;
        setBackgroundDrawable(null);
        setViewLifeCycleCallback(this.copydefault);
        setTextSize(14.0f);
        setGravity(8388659);
        setInputType(1);
        setSingleLine(false);
        setHintTextColor(Color.rgb(128, 128, 128));
        setTextColor(getResources().getColor(android.R.color.black));
        setPaddingRelative(0, 0, 0, 0);
        setEllipsize(TextUtils.TruncateAt.END);
        setOnEditorActionListener(getUserdata());
    }

    public void setCursorColor(int i) {
        C55307xhV.AEQbTJ(this, i, C55298xhM.OLrzqt(2, getContext()), 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // com.okinc.uilab.edit.OKEditText, android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        getUserdata().OLrzqt(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            setCursorVisible(true);
        }
        this.copydefault.AEQbTJ(z);
    }

    @Override // o.C7811aqq, android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            setCursorVisible(true);
            getUserdata().AhwBna();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.okinc.uilab.edit.OKEditText, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.AEQbTJ;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // com.okinc.uilab.edit.OKEditText, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.AEQbTJ;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }

    @Override // o.C55001xbh, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(@androidx.annotation.NonNull android.view.inputmethod.EditorInfo editorInfo) {
        return new TaskDescription(super.onCreateInputConnection(editorInfo), true);
    }

    /* JADX INFO: renamed from: o.alh$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public class TaskDescription extends android.view.inputmethod.InputConnectionWrapper {
        public TaskDescription(android.view.inputmethod.InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && C7537alh.this.EZpvd != null) {
                C7537alh.this.EZpvd.EZpvd();
            }
            return super.sendKeyEvent(keyEvent);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            if (i == 1 && i2 == 0) {
                return sendKeyEvent(new android.view.KeyEvent(0, 67)) && sendKeyEvent(new android.view.KeyEvent(1, 67));
            }
            return super.deleteSurroundingText(i, i2);
        }
    }
}
