package com.immomo.mls.fun.ud.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Calendar;
import java.util.Date;
import o.C32113mPz;
import o.C33518mxv;
import o.InterfaceC5318Nc;
import o.InterfaceC5319Nd;
import o.InterfaceC60044zuT;
import o.InterfaceC7383aim;
import o.InterfaceC7384ain;
import o.MY;
import o.MZ;
import o.ViewOnClickListenerC5326Nk;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDDatePickView extends UDView<FrameLayout> {
    public static final String[] KWHzl = {OtcExtraKeys.MODE, "minDate", "maxDate", "date", "setCallback"};
    public LuaFunction AEQbTJ;
    public boolean[] AYXKKw;
    public boolean[] AhwBna;
    public Calendar AkhnZx;
    public boolean DbNXlk;
    public MZ EZpvd;
    public int OLrzqt;
    public long copydefault;
    public long djBIcL;
    public Calendar fetchVPNInfo;
    public boolean gEmmrt;
    public long isConnected;
    public Calendar valueOf;
    public ViewOnClickListenerC5326Nk values;

    @InterfaceC60044zuT
    public UDDatePickView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.OLrzqt = 0;
        this.djBIcL = 0L;
        this.isConnected = 0L;
        this.DbNXlk = false;
        this.gEmmrt = false;
    }

    @InterfaceC60044zuT
    public LuaValue[] mode(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        this.OLrzqt = luaValueArr[0].toInt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] minDate(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.varargsOf(LuaValue.rNumber(this.isConnected));
        }
        this.isConnected = luaValueArr[0].toLong() * 1000;
        this.DbNXlk = true;
        valueOf();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] maxDate(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.varargsOf(LuaValue.rNumber(this.djBIcL));
        }
        this.djBIcL = luaValueArr[0].toLong() * 1000;
        this.gEmmrt = true;
        valueOf();
        return null;
    }

    private void valueOf() {
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = this.values;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.AEQbTJ(gEmmrt());
        }
        MZ mz = this.EZpvd;
        if (mz != null && this.DbNXlk && this.gEmmrt) {
            mz.copydefault(gEmmrt());
            if (this.OLrzqt == 0) {
                this.EZpvd.KWHzl(this.AhwBna);
            } else {
                this.EZpvd.KWHzl(this.AYXKKw);
            }
            ViewOnClickListenerC5326Nk viewOnClickListenerC5326NkEZpvd = this.EZpvd.EZpvd();
            this.values = viewOnClickListenerC5326NkEZpvd;
            viewOnClickListenerC5326NkEZpvd.AEQbTJ(null, false);
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] date(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        this.copydefault = luaValueArr[0].toLong() * 1000;
        valueOf();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setCallback(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        LuaFunction luaFunction = this.AEQbTJ;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.AEQbTJ = luaValueArr[0].toLuaFunction();
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public FrameLayout AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        TaskDescription taskDescription = new TaskDescription(AubY(), this);
        taskDescription.setMinimumHeight(C33518mxv.EZpvd(AubY(), 150.0f));
        taskDescription.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fetchVPNInfo = AYXKKw();
        this.valueOf = OLrzqt();
        this.AYXKKw = new boolean[]{true, true, true, false, false, false};
        this.AhwBna = new boolean[]{false, false, false, true, true, true};
        this.AkhnZx = AYXKKw();
        this.EZpvd = new MZ(AubY(), new InterfaceC5318Nc() { // from class: com.immomo.mls.fun.ud.view.UDDatePickView.2
            @Override // o.InterfaceC5318Nc
            public void copydefault(Date date, View view) {
                long time;
                if (UDDatePickView.this.AEQbTJ != null) {
                    Calendar calendar = Calendar.getInstance();
                    if (date.getTime() > UDDatePickView.this.djBIcL) {
                        time = UDDatePickView.this.djBIcL;
                        calendar.setTimeInMillis(UDDatePickView.this.djBIcL);
                        UDDatePickView.this.values.AEQbTJ(calendar);
                    } else if (date.getTime() < UDDatePickView.this.isConnected) {
                        time = UDDatePickView.this.isConnected;
                        calendar.setTimeInMillis(UDDatePickView.this.isConnected);
                        UDDatePickView.this.values.AEQbTJ(calendar);
                    } else {
                        time = date.getTime();
                    }
                    UDDatePickView.this.AEQbTJ.invoke(LuaValue.rNumber(time / 1000));
                }
            }
        }).AEQbTJ(C32113mPz.Fragment.AwvSrB, new MY() { // from class: com.immomo.mls.fun.ud.view.UDDatePickView.3
            @Override // o.MY
            public void AEQbTJ(View view) {
            }
        }).KWHzl(this.AYXKKw).EZpvd("", "", "", "", "", "").EZpvd(AubY().getResources().getColor(C32113mPz.ActionBar.fJNWhG)).KWHzl(20).copydefault(this.AkhnZx).copydefault(-30, 30, 0, 30, 0, -30).AEQbTJ(taskDescription).OLrzqt(AubY().getResources().getColor(C32113mPz.ActionBar.isConnected)).EZpvd(false).AEQbTJ(AubY().getResources().getColor(C32113mPz.ActionBar.zLjUOn)).AYXKKw(AubY().getResources().getColor(C32113mPz.ActionBar.ejfBZ)).copydefault(2.0f).copydefault(7).KWHzl(true).copydefault(new InterfaceC5319Nd() { // from class: com.immomo.mls.fun.ud.view.UDDatePickView.1
            @Override // o.InterfaceC5319Nd
            public void KWHzl(Date date) {
                if (UDDatePickView.this.values != null) {
                    UDDatePickView.this.values.fetchVPNInfo();
                }
            }
        });
        return taskDescription;
    }

    public final Calendar AYXKKw() {
        return KWHzl(this.isConnected);
    }

    public final Calendar OLrzqt() {
        return KWHzl(this.djBIcL);
    }

    public final Calendar gEmmrt() {
        if (this.copydefault == 0) {
            this.copydefault = System.currentTimeMillis();
        }
        return KWHzl(this.copydefault);
    }

    public final Calendar KWHzl(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar;
    }

    public static class TaskDescription<U extends UDDatePickView> extends FrameLayout implements InterfaceC7384ain {
        public U AEQbTJ;

        @Override // o.InterfaceC7384ain
        public ViewGroup.LayoutParams applyChildCenter(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
            return null;
        }

        @Override // o.InterfaceC7384ain
        public ViewGroup.LayoutParams applyLayoutParams(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
            return null;
        }

        @Override // o.InterfaceC7384ain
        public void bringSubviewToFront(UDView uDView) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC7383aim
        public UDView getUserdata() {
            return this.AEQbTJ;
        }

        @Override // o.InterfaceC7384ain
        public void sendSubviewToBack(UDView uDView) {
        }

        public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        }

        public TaskDescription(Context context, U u) {
            super(context);
            this.AEQbTJ = u;
        }

        public TaskDescription(@NonNull Context context) {
            super(context);
        }

        public TaskDescription(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public TaskDescription(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return super.dispatchTouchEvent(motionEvent);
        }
    }
}
