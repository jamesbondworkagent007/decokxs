package o;

import android.view.ActionMode;
import android.view.Window;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class WindowCallbackC5229Jr implements Window.Callback {
    public final Window.Callback AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Window.Callback KWHzl() {
        return this.AEQbTJ;
    }

    public WindowCallbackC5229Jr(@NotNull Window.Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "");
        this.AEQbTJ = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.AEQbTJ.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return this.AEQbTJ.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return this.AEQbTJ.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return this.AEQbTJ.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return this.AEQbTJ.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.AEQbTJ.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int i) {
        return this.AEQbTJ.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @NotNull android.view.Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "");
        return this.AEQbTJ.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, android.view.View view, @NotNull android.view.Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "");
        return this.AEQbTJ.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, @NotNull android.view.Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "");
        return this.AEQbTJ.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NotNull android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        return this.AEQbTJ.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.AEQbTJ.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.AEQbTJ.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.AEQbTJ.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.AEQbTJ.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.AEQbTJ.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, @NotNull android.view.Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "");
        this.AEQbTJ.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.AEQbTJ.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        return this.AEQbTJ.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.AEQbTJ.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.AEQbTJ.onWindowStartingActionMode(callback, i);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode actionMode) {
        this.AEQbTJ.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode actionMode) {
        this.AEQbTJ.onActionModeFinished(actionMode);
    }
}
