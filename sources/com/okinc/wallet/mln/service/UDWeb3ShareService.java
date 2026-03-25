package com.okinc.wallet.mln.service;

import android.app.Activity;
import android.content.Context;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.business.defi.share.Web3ShareService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C43251rlk;
import o.C7322ahe;
import o.InterfaceC13655dTj;
import o.InterfaceC60037zuM;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@LuaClass
public final class UDWeb3ShareService {
    public final Globals OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.mln.service.UDWeb3ShareService.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public UDWeb3ShareService(Globals globals, LuaValue[] luaValueArr) {
        this.OLrzqt = globals;
    }

    public final Activity KWHzl() {
        Globals globals = this.OLrzqt;
        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [T, org.luaj.vm2.LuaFunction] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, org.luaj.vm2.LuaFunction] */
    @LuaBridge
    public final LuaValue[] share(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        String javaString = luaValueArr[0].toJavaString();
        String javaString2 = luaValueArr[1].toJavaString();
        String javaString3 = luaValueArr[2].toJavaString();
        String javaString4 = luaValueArr[3].toJavaString();
        String javaString5 = luaValueArr[4].toJavaString();
        String javaString6 = luaValueArr[5].toJavaString();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (luaValueArr.length > 6 && !luaValueArr[6].isNil()) {
            objectRef.element = luaValueArr[6].toLuaFunction();
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        if (luaValueArr.length > 7 && !luaValueArr[7].isNil()) {
            objectRef2.element = luaValueArr[7].toLuaFunction();
        }
        Activity activityKWHzl = KWHzl();
        if (activityKWHzl != null) {
            Web3ShareService web3ShareService = (Web3ShareService) C43251rlk.copydefault(Web3ShareService.class);
            Intrinsics.copydefault((Object) javaString);
            Intrinsics.copydefault((Object) javaString2);
            Intrinsics.copydefault((Object) javaString3);
            Intrinsics.copydefault((Object) javaString4);
            Intrinsics.copydefault((Object) javaString5);
            Intrinsics.copydefault((Object) javaString6);
            web3ShareService.shareByMiniProgramActivity(activityKWHzl, javaString, javaString2, 1, javaString3, javaString4, javaString5, javaString6, new TaskDescription(objectRef, objectRef2));
        }
        return LuaValue.rNil();
    }

    public static final class TaskDescription implements InterfaceC13655dTj {
        public final /* synthetic */ Ref.ObjectRef<LuaFunction> OLrzqt;
        public final /* synthetic */ Ref.ObjectRef<LuaFunction> copydefault;

        public TaskDescription(Ref.ObjectRef<LuaFunction> objectRef, Ref.ObjectRef<LuaFunction> objectRef2) {
            this.copydefault = objectRef;
            this.OLrzqt = objectRef2;
        }

        @Override // o.InterfaceC13655dTj
        public void copydefault() {
            LuaFunction luaFunction = this.copydefault.element;
            if (luaFunction != null) {
                luaFunction.OLrzqt();
            }
        }

        @Override // o.InterfaceC13655dTj
        public void AEQbTJ() {
            LuaFunction luaFunction = this.OLrzqt.element;
            if (luaFunction != null) {
                luaFunction.OLrzqt();
            }
        }
    }
}
