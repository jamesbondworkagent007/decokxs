package o;

import com.contrarywind.view.WheelView;
import com.okinc.annual.timepicker.UDGrowthDatePickerView;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.InterfaceC7383aim;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.axM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8150axM extends android.widget.FrameLayout implements InterfaceC7383aim<UDGrowthDatePickerView<?>> {
    public long AEQbTJ;
    public LuaFunction EZpvd;
    public ViewOnClickListenerC8143axF KWHzl;
    public C8141axD OLrzqt;
    public long copydefault;
    public UDGrowthDatePickerView<?> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        this.EZpvd = luaFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(@NotNull InterfaceC7383aim.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8150axM(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8150axM(@NotNull android.content.Context context, UDGrowthDatePickerView<?> uDGrowthDatePickerView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = uDGrowthDatePickerView;
        copydefault();
    }

    public final void copydefault() {
        this.OLrzqt = new C8141axD(getContext(), new InterfaceC5318Nc() { // from class: o.axQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5318Nc
            public final void copydefault(Date date, android.view.View view) {
                C8150axM.OLrzqt(this.copydefault, date, view);
            }
        }).EZpvd(C32113mPz.Fragment.AwvSrB, new MY() { // from class: o.axP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.MY
            public final void AEQbTJ(android.view.View view) {
                C8150axM.EZpvd(this.copydefault, view);
            }
        }).AEQbTJ(new boolean[]{true, true, true, false, false, false}).EZpvd("", "", "", "", "", "").AEQbTJ(this).AEQbTJ(false).copydefault(false).OLrzqt(new InterfaceC5319Nd() { // from class: o.axU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5319Nd
            public final void KWHzl(Date date) {
                C8150axM.EZpvd(this.KWHzl, date);
            }
        });
    }

    public static final void OLrzqt(C8150axM c8150axM, Date date, android.view.View view) {
        Calendar calendar = Calendar.getInstance();
        long time = date.getTime();
        long time2 = c8150axM.AEQbTJ;
        if (time > time2) {
            calendar.setTimeInMillis(time2);
            ViewOnClickListenerC8143axF viewOnClickListenerC8143axF = c8150axM.KWHzl;
            if (viewOnClickListenerC8143axF != null) {
                viewOnClickListenerC8143axF.EZpvd(calendar);
            }
        } else {
            long time3 = date.getTime();
            time2 = c8150axM.copydefault;
            if (time3 < time2) {
                calendar.setTimeInMillis(time2);
                ViewOnClickListenerC8143axF viewOnClickListenerC8143axF2 = c8150axM.KWHzl;
                if (viewOnClickListenerC8143axF2 != null) {
                    viewOnClickListenerC8143axF2.EZpvd(calendar);
                }
            } else {
                time2 = date.getTime();
            }
        }
        LuaFunction luaFunction = c8150axM.EZpvd;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rNumber(time2 / ((long) 1000)));
        }
    }

    public static final void EZpvd(C8150axM c8150axM, android.view.View view) {
        Intrinsics.copydefault(view);
        c8150axM.copydefault(view);
    }

    public static final void EZpvd(C8150axM c8150axM, Date date) {
        ViewOnClickListenerC8143axF viewOnClickListenerC8143axF = c8150axM.KWHzl;
        if (viewOnClickListenerC8143axF != null) {
            viewOnClickListenerC8143axF.fetchVPNInfo();
        }
    }

    public final void copydefault(android.view.View view) {
        WheelView wheelView = (WheelView) view.findViewById(C32113mPz.FragmentManager.RJOkX);
        WheelView wheelView2 = (WheelView) view.findViewById(C32113mPz.FragmentManager.values);
        WheelView wheelView3 = (WheelView) view.findViewById(C32113mPz.FragmentManager.OFhtUX);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(C32113mPz.FragmentManager.hUfVAv);
        linearLayout.removeView(wheelView);
        linearLayout.removeView(wheelView2);
        linearLayout.removeView(wheelView3);
        for (char c : android.text.format.DateFormat.getDateFormatOrder(getContext())) {
            if (c == 'M') {
                linearLayout.addView(wheelView);
            } else if (c == 'd') {
                linearLayout.addView(wheelView2);
            } else if (c == 'y') {
                linearLayout.addView(wheelView3);
            }
        }
    }

    public final void AEQbTJ() {
        C8141axD c8141axD = this.OLrzqt;
        ViewOnClickListenerC8143axF viewOnClickListenerC8143axFOLrzqt = c8141axD != null ? c8141axD.OLrzqt() : null;
        this.KWHzl = viewOnClickListenerC8143axFOLrzqt;
        if (viewOnClickListenerC8143axFOLrzqt != null) {
            viewOnClickListenerC8143axFOLrzqt.OLrzqt(false);
        }
        ViewOnClickListenerC8143axF viewOnClickListenerC8143axF = this.KWHzl;
        if (viewOnClickListenerC8143axF != null) {
            viewOnClickListenerC8143axF.AEQbTJ(null, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8150axM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public UDGrowthDatePickerView<?> getUserdata() {
        UDGrowthDatePickerView<?> uDGrowthDatePickerView = this.valueOf;
        Intrinsics.copydefault(uDGrowthDatePickerView);
        return uDGrowthDatePickerView;
    }

    public final void setRangDate(long j, long j2) {
        if (j > j2) {
            pUU.EZpvd("LuaGrowthDatePickerView", "setRangDate: minTimeStamp should < maxTimeStamp");
            return;
        }
        this.copydefault = j;
        this.AEQbTJ = j2;
        C8141axD c8141axD = this.OLrzqt;
        TimeZone timeZoneCopydefault = c8141axD != null ? c8141axD.copydefault() : null;
        if (timeZoneCopydefault != null) {
            Calendar calendar = Calendar.getInstance(timeZoneCopydefault);
            calendar.setTimeInMillis(this.copydefault);
            Calendar calendar2 = Calendar.getInstance(timeZoneCopydefault);
            calendar2.setTimeInMillis(this.AEQbTJ);
            Calendar calendar3 = Calendar.getInstance(timeZoneCopydefault);
            calendar3.setTimeInMillis(java.lang.System.currentTimeMillis());
            if (this.AEQbTJ < java.lang.System.currentTimeMillis()) {
                C8141axD c8141axD2 = this.OLrzqt;
                if (c8141axD2 != null) {
                    c8141axD2.AEQbTJ(calendar2);
                }
            } else if (this.copydefault > java.lang.System.currentTimeMillis()) {
                C8141axD c8141axD3 = this.OLrzqt;
                if (c8141axD3 != null) {
                    c8141axD3.AEQbTJ(calendar);
                }
            } else {
                C8141axD c8141axD4 = this.OLrzqt;
                if (c8141axD4 != null) {
                    c8141axD4.AEQbTJ(calendar3);
                }
            }
            C8141axD c8141axD5 = this.OLrzqt;
            if (c8141axD5 != null) {
                c8141axD5.KWHzl(calendar, calendar2);
            }
        }
    }

    public final void copydefault(int i) {
        TimeZone timeZoneOLrzqt;
        if (i != 0 && i == 1) {
            timeZoneOLrzqt = yCN.OLrzqt("GMT+8");
        } else {
            timeZoneOLrzqt = TimeZone.getDefault();
        }
        C8141axD c8141axD = this.OLrzqt;
        if (c8141axD != null) {
            Intrinsics.copydefault(timeZoneOLrzqt);
            c8141axD.EZpvd(timeZoneOLrzqt);
        }
    }

    public final int KWHzl() {
        C8141axD c8141axD = this.OLrzqt;
        TimeZone timeZoneCopydefault = c8141axD != null ? c8141axD.copydefault() : null;
        if (Intrinsics.EZpvd(timeZoneCopydefault, yCN.OLrzqt("GMT+8"))) {
            return 1;
        }
        Intrinsics.EZpvd(timeZoneCopydefault, TimeZone.getDefault());
        return 0;
    }

    public final void setLineSpacingMultiplier(float f) {
        C8141axD c8141axD = this.OLrzqt;
        if (c8141axD != null) {
            c8141axD.EZpvd(f);
        }
    }

    public final java.lang.Float EZpvd() {
        ViewOnClickListenerC8143axF viewOnClickListenerC8143axF = this.KWHzl;
        if (viewOnClickListenerC8143axF != null) {
            return java.lang.Float.valueOf(viewOnClickListenerC8143axF.isConnected());
        }
        return null;
    }

    public final void setTextColorOut(int i) {
        C8141axD c8141axD = this.OLrzqt;
        if (c8141axD != null) {
            c8141axD.djBIcL(i);
        }
    }

    public final void setTextColorCenter(int i) {
        C8141axD c8141axD = this.OLrzqt;
        if (c8141axD != null) {
            c8141axD.copydefault(i);
        }
    }

    public final void setBgColor(int i) {
        C8141axD c8141axD = this.OLrzqt;
        if (c8141axD != null) {
            c8141axD.EZpvd(i);
        }
    }

    public final void setTypeface(@NotNull android.graphics.Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "");
        C8141axD c8141axD = this.OLrzqt;
        if (c8141axD != null) {
            c8141axD.AEQbTJ(typeface);
        }
    }

    public final void setContentTextSize(int i) {
        C8141axD c8141axD = this.OLrzqt;
        if (c8141axD != null) {
            c8141axD.AEQbTJ(i);
        }
    }

    public final void setDividerColor(int i) {
        C8141axD c8141axD = this.OLrzqt;
        if (c8141axD != null) {
            c8141axD.KWHzl(i);
        }
    }

    public final void setItemVisibleCount(int i) {
        C8141axD c8141axD = this.OLrzqt;
        if (c8141axD != null) {
            c8141axD.OLrzqt(i);
        }
    }

    public final void KWHzl(boolean z) {
        C8141axD c8141axD = this.OLrzqt;
        if (c8141axD != null) {
            c8141axD.copydefault(z);
        }
    }
}
