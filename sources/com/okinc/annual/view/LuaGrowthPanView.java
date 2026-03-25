package com.okinc.annual.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.FrameLayout;
import com.immomo.mls.fun.ud.UDPoint;
import o.InterfaceC7383aim;

/* JADX INFO: loaded from: classes3.dex */
public class LuaGrowthPanView extends FrameLayout implements InterfaceC7383aim<UDGrowthPanView> {
    private DragState currentState;
    private float currentX;
    private float currentY;
    private InterfaceC7383aim.ActionBar cycleCallback;
    private float deltaX;
    private float deltaY;
    private Activity dragListener;
    private float dx;
    private float dy;
    private boolean enableBegin;
    private boolean isFirstMove;
    private float lastX;
    private float lastY;
    private UDPoint mUDPoint;
    private float startX;
    private float startY;
    private UDGrowthPanView userdata;
    private final VelocityTracker velocityTracker;
    private float velocityX;
    private float velocityY;

    public interface Activity {
        void KWHzl(DragState dragState);
    }

    public enum DragState {
        NONE,
        DOWN,
        MOVE,
        UP,
        CANCEL
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DragState getCurrentState() {
        return this.currentState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getCurrentX() {
        return this.currentX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getCurrentY() {
        return this.currentY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    public UDGrowthPanView getUserdata() {
        return this.userdata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getVelocityX() {
        return this.velocityX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getVelocityY() {
        return this.velocityY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void panEnableBegin(boolean z) {
        this.enableBegin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDragListener(Activity activity) {
        this.dragListener = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTranslation(UDPoint uDPoint) {
        this.mUDPoint = uDPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.cycleCallback = actionBar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.cycleCallback;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    public LuaGrowthPanView(Context context) {
        super(context);
        this.velocityTracker = VelocityTracker.obtain();
        this.currentState = DragState.NONE;
        this.mUDPoint = null;
        this.enableBegin = true;
        this.isFirstMove = false;
    }

    public LuaGrowthPanView(Context context, UDGrowthPanView uDGrowthPanView) {
        super(context);
        this.velocityTracker = VelocityTracker.obtain();
        this.currentState = DragState.NONE;
        this.mUDPoint = null;
        this.enableBegin = true;
        this.isFirstMove = false;
        this.userdata = uDGrowthPanView;
    }

    public LuaGrowthPanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.velocityTracker = VelocityTracker.obtain();
        this.currentState = DragState.NONE;
        this.mUDPoint = null;
        this.enableBegin = true;
        this.isFirstMove = false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.velocityTracker.addMovement(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.currentX = x;
        this.currentY = y;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            DragState dragState = DragState.DOWN;
            this.currentState = dragState;
            Activity activity = this.dragListener;
            if (activity != null) {
                activity.KWHzl(dragState);
            }
            this.startX = x;
            this.startY = y;
            this.dy = 0.0f;
            this.dx = 0.0f;
            this.deltaY = 0.0f;
            this.deltaX = 0.0f;
            this.velocityY = 0.0f;
            this.velocityX = 0.0f;
            this.isFirstMove = true;
        } else if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (!this.enableBegin) {
                        this.enableBegin = true;
                        return false;
                    }
                    DragState dragState2 = DragState.CANCEL;
                    this.currentState = dragState2;
                    Activity activity2 = this.dragListener;
                    if (activity2 != null) {
                        activity2.KWHzl(dragState2);
                    }
                    this.dx = x - this.lastX;
                    this.dy = y - this.lastY;
                    this.deltaX = x - this.startX;
                    this.deltaY = y - this.startY;
                    this.velocityTracker.clear();
                }
            } else {
                if (!this.enableBegin) {
                    return false;
                }
                DragState dragState3 = DragState.MOVE;
                this.currentState = dragState3;
                Activity activity3 = this.dragListener;
                if (activity3 != null) {
                    activity3.KWHzl(dragState3);
                }
                this.velocityTracker.computeCurrentVelocity(1000);
                this.velocityX = this.velocityTracker.getXVelocity();
                this.velocityY = this.velocityTracker.getYVelocity();
                if (this.isFirstMove) {
                    this.dy = 0.0f;
                    this.dx = 0.0f;
                    this.isFirstMove = false;
                } else {
                    this.dx = x - this.lastX;
                    this.dy = y - this.lastY;
                    this.deltaX = x - this.startX;
                    this.deltaY = y - this.startY;
                }
            }
        } else {
            if (!this.enableBegin) {
                this.enableBegin = true;
                return false;
            }
            DragState dragState4 = DragState.UP;
            this.currentState = dragState4;
            Activity activity4 = this.dragListener;
            if (activity4 != null) {
                activity4.KWHzl(dragState4);
            }
            this.velocityTracker.computeCurrentVelocity(1000);
            this.velocityX = this.velocityTracker.getXVelocity();
            this.velocityY = this.velocityTracker.getYVelocity();
            this.dx = x - this.lastX;
            this.dy = y - this.lastY;
            this.deltaX = x - this.startX;
            this.deltaY = y - this.startY;
            this.velocityTracker.clear();
        }
        this.lastX = x;
        this.lastY = y;
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.cycleCallback;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
        this.velocityTracker.recycle();
    }

    public float getDeltaX() {
        UDPoint uDPoint = this.mUDPoint;
        return uDPoint != null ? uDPoint.EZpvd().KWHzl() + this.dx : this.deltaX;
    }

    public float getDeltaY() {
        UDPoint uDPoint = this.mUDPoint;
        return uDPoint != null ? uDPoint.EZpvd().EZpvd() + this.dy : this.deltaY;
    }
}
