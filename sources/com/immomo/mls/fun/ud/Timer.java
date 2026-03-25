package com.immomo.mls.fun.ud;

import com.immomo.mls.annotation.BridgeType;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import o.C7840arS;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.exception.InvokeError;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass(gcByLua = false)
public class Timer {
    public static final String LUA_CLASS_NAME = "Timer";
    public static final byte STATE_END = 3;
    public static final byte STATE_IDEL = 0;
    public static final byte STATE_PAUSING = 2;
    public static final byte STATE_RUNNING = 1;
    public long interval;
    public StateListAnimator runningTask;
    public LuaFunction task;

    @LuaBridge
    public int repeatCount = 0;
    public byte state = 0;
    public final Object tag = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object AEQbTJ() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "interval", type = BridgeType.GETTER)
    public float getInterval() {
        return this.interval / 1000.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void pause() {
        if (this.state == 1) {
            this.state = (byte) 2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "interval", type = BridgeType.SETTER)
    public void setInterval(float f) {
        this.interval = (long) (f * 1000.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void stop() {
        this.state = (byte) 3;
        this.task = null;
        this.runningTask = null;
    }

    public Timer(Globals globals, LuaValue[] luaValueArr) {
    }

    @InterfaceC60044zuT
    public void EZpvd() {
        LuaFunction luaFunction = this.task;
        if (luaFunction != null) {
            luaFunction.destroy();
            this.task = null;
        }
        this.runningTask = null;
        C7840arS.EZpvd(AEQbTJ());
    }

    @LuaBridge
    public void start(LuaFunction luaFunction) {
        byte b = this.state;
        if (b == 1 || b == 2) {
            return;
        }
        this.task = luaFunction;
        this.state = (byte) 1;
        this.runningTask = new StateListAnimator();
        C7840arS.KWHzl(AEQbTJ(), this.runningTask);
        C7840arS.KWHzl(AEQbTJ(), this.runningTask, this.interval);
    }

    @LuaBridge
    public void resume() {
        if (this.state == 2) {
            this.state = (byte) 1;
            C7840arS.KWHzl(AEQbTJ(), this.runningTask);
            this.runningTask.run();
        }
    }

    @LuaBridge
    public void resumeDelay() {
        if (this.state == 2) {
            this.state = (byte) 1;
            if (this.runningTask != null) {
                C7840arS.KWHzl(AEQbTJ(), this.runningTask);
                C7840arS.KWHzl(AEQbTJ(), this.runningTask, this.interval);
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public final class StateListAnimator implements Runnable {
        public int AEQbTJ = 0;

        public StateListAnimator() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Timer.this.task == null || Timer.this.task.getGlobals() == null || Timer.this.task.getGlobals().isDestroyed()) {
                Timer.this.state = (byte) 3;
                return;
            }
            if (Timer.this.state != 1) {
                return;
            }
            Timer timer = Timer.this;
            int i = timer.repeatCount;
            if (i > 0) {
                int i2 = this.AEQbTJ + 1;
                this.AEQbTJ = i2;
                if (i <= i2) {
                    try {
                        timer.task.invoke(LuaValue.rTrue());
                    } catch (InvokeError unused) {
                    }
                    Timer.this.state = (byte) 3;
                    Timer.this.task = null;
                    return;
                }
            }
            try {
                timer.task.invoke(LuaValue.rFalse());
                C7840arS.KWHzl(Timer.this.AEQbTJ(), this);
                C7840arS.KWHzl(Timer.this.AEQbTJ(), this, Timer.this.interval);
            } catch (InvokeError unused2) {
                Timer.this.task = null;
            }
        }
    }
}
