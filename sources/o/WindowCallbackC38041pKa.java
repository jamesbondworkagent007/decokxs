package o;

import android.view.ActionMode;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: renamed from: o.pKa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class WindowCallbackC38041pKa implements Window.Callback {
    public Window.Callback copydefault;

    public boolean KWHzl() {
        return false;
    }

    public boolean KWHzl(android.view.MotionEvent motionEvent) {
        return false;
    }

    public WindowCallbackC38041pKa(Window.Callback callback) {
        this.copydefault = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        try {
            if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                Window.Callback callback = this.copydefault;
                return callback != null && callback.dispatchKeyEvent(keyEvent);
            }
            if (KWHzl()) {
                return true;
            }
            Window.Callback callback2 = this.copydefault;
            return callback2 != null && callback2.dispatchKeyEvent(keyEvent);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        Window.Callback callback = this.copydefault;
        return callback != null && callback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return this.copydefault != null && (KWHzl(motionEvent) || this.copydefault.dispatchTouchEvent(motionEvent));
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        Window.Callback callback = this.copydefault;
        return callback != null && callback.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        Window.Callback callback = this.copydefault;
        return callback != null && callback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        Window.Callback callback = this.copydefault;
        return callback != null && callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int i) {
        Window.Callback callback = this.copydefault;
        if (callback == null) {
            return null;
        }
        return callback.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        Window.Callback callback = this.copydefault;
        return callback != null && callback.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        Window.Callback callback = this.copydefault;
        return callback != null && callback.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, android.view.Menu menu) {
        Window.Callback callback = this.copydefault;
        return callback != null && callback.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        Window.Callback callback = this.copydefault;
        return callback != null && callback.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback = this.copydefault;
        if (callback != null) {
            callback.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        Window.Callback callback = this.copydefault;
        if (callback != null) {
            callback.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Window.Callback callback = this.copydefault;
        if (callback != null) {
            callback.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        Window.Callback callback = this.copydefault;
        if (callback != null) {
            callback.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        Window.Callback callback = this.copydefault;
        if (callback != null) {
            callback.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, android.view.Menu menu) {
        Window.Callback callback = this.copydefault;
        if (callback != null) {
            callback.onPanelClosed(i, menu);
        }
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        Window.Callback callback = this.copydefault;
        return callback != null && callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        Window.Callback callback = this.copydefault;
        return callback != null && callback.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2 = this.copydefault;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Window.Callback callback2 = this.copydefault;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback, i);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode actionMode) {
        Window.Callback callback = this.copydefault;
        if (callback != null) {
            callback.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode actionMode) {
        Window.Callback callback = this.copydefault;
        if (callback != null) {
            callback.onActionModeFinished(actionMode);
        }
    }
}
