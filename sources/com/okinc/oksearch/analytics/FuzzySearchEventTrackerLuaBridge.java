package com.okinc.oksearch.analytics;

import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes10.dex */
@LuaClass
public final class FuzzySearchEventTrackerLuaBridge {
    public static final TaskDescription Companion = new TaskDescription(null);

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oksearch.analytics.FuzzySearchEventTrackerLuaBridge.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @LuaBridge
    public final void trackFuzzySearchClick(@NotNull LuaValue[] luaValueArr) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if ((!(luaValueArr.length == 0)) && luaValueArr[0].isString()) {
            String javaString = luaValueArr[0].toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
            str = javaString;
        } else {
            str = "";
        }
        if ((!(luaValueArr.length == 0)) && luaValueArr[1].isString()) {
            String javaString2 = luaValueArr[1].toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString2, "");
            str2 = javaString2;
        } else {
            str2 = "";
        }
        if ((!(luaValueArr.length == 0)) && luaValueArr[2].isString()) {
            String javaString3 = luaValueArr[2].toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString3, "");
            str3 = javaString3;
        } else {
            str3 = "";
        }
        if ((!(luaValueArr.length == 0)) && luaValueArr[3].isString()) {
            String javaString4 = luaValueArr[3].toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString4, "");
            str4 = javaString4;
        } else {
            str4 = "";
        }
        if ((!(luaValueArr.length == 0)) && luaValueArr[4].isString()) {
            String javaString5 = luaValueArr[4].toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString5, "");
            str5 = javaString5;
        } else {
            str5 = "";
        }
        FuzzySearchEventTracker.EZpvd.KWHzl(str, str2, str3, str4, "", "", str5);
    }
}
