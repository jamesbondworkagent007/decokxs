package com.immomo.mls.fun.ui.uilib.loading;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.mls.fun.ud.view.UDView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import o.InterfaceC60044zuT;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKLoadingView extends UDView<View> {
    public static final Application Companion = new Application(null);
    public static final String[] AEQbTJ = new String[0];
    public static final String copydefault = MLNOKLoadingView.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKLoadingView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public View AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        View viewInflate = LayoutInflater.from(AubY()).inflate(C7343ahz.Activity.DbNXlk, (ViewGroup) null);
        Intrinsics.copydefault(viewInflate);
        return viewInflate;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.loading.MLNOKLoadingView.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] EZpvd() {
            return MLNOKLoadingView.AEQbTJ;
        }
    }
}
