package com.okinc.wallet.mln.service;

import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.wallet.mln.service.UDWeb3AnalyticsService;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32868mlh;
import o.C43251rlk;
import o.C7916asp;
import o.InterfaceC9847bdM;
import o.yDV;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@LuaClass
public final class UDWeb3AnalyticsService {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final Globals OLrzqt;

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.mln.service.UDWeb3AnalyticsService.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public UDWeb3AnalyticsService(Globals globals, LuaValue[] luaValueArr) {
        this.OLrzqt = globals;
    }

    @LuaBridge
    public final void eventWithItems(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return;
        }
        boolean z = false;
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        final HashMap map = null;
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        if (javaString != null) {
            if (luaValue2 != null && (luaValue2 instanceof LuaTable)) {
                Map<String, Object> mapOLrzqt = C7916asp.OLrzqt((LuaTable) luaValue2);
                if (mapOLrzqt instanceof HashMap) {
                    map = (HashMap) mapOLrzqt;
                }
            }
            InterfaceC9847bdM interfaceC9847bdM = (InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
            Function1<? super EventParamsList, Unit> function1 = new Function1() { // from class: o.yep
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDWeb3AnalyticsService.copydefault(map, (EventParamsList) obj);
                }
            };
            if (luaValue3 == null || ((luaValue3 instanceof LuaBoolean) && ((LuaBoolean) luaValue3).toBoolean())) {
                z = true;
            }
            interfaceC9847bdM.AEQbTJ(javaString, trackChannelArr, function1, z);
        }
    }

    public static final Unit copydefault(HashMap map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object obj = ((HashMap) entry.getValue()).get("type");
                Intrinsics.copydefault(obj, "");
                int iIntValue = ((Integer) obj).intValue();
                eventParamsList.add(new EventParam(String.valueOf(((HashMap) entry.getValue()).get(JwtUtilsKt.DID_METHOD_KEY)), String.valueOf(((HashMap) entry.getValue()).get("value")), iIntValue == 0));
            }
        }
        return Unit.INSTANCE;
    }
}
