package com.okinc.planet.mlnservice.view;

import android.content.Context;
import android.view.View;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43251rlk;
import o.C55374xij;
import o.InterfaceC60044zuT;
import o.pUU;
import o.tWM;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC60044zuT
public final class UDPlanetPluginView extends UDView<View> {
    public static final Activity Companion = new Activity(null);

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.mlnservice.view.UDPlanetPluginView.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @InterfaceC60044zuT
    public UDPlanetPluginView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public View AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        Context contextAubY;
        View viewAEQbTJ;
        String javaString2;
        String str = "";
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 3) {
            LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
            if (luaValue == null || (javaString = luaValue.toJavaString()) == null) {
                javaString = "";
            }
            LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
            if (luaValue2 != null && (javaString2 = luaValue2.toJavaString()) != null) {
                str = javaString2;
            }
            LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
            Integer numValueOf = luaValue3 != null ? Integer.valueOf(luaValue3.toInt()) : null;
            pUU.EZpvd("qjf", "OKPlanetPluginView---->pluginType = " + javaString + ", previewType = " + numValueOf + ", metaDataJson = " + str);
            PlanetPublisherPluginPreviewType.Application application = PlanetPublisherPluginPreviewType.Companion;
            if (application.copydefault(numValueOf) == PlanetPublisherPluginPreviewType.FEED_SHARE) {
                contextAubY = OLrzqt();
            } else {
                contextAubY = AubY();
            }
            PlanetPublisherPluginType planetPublisherPluginTypeOLrzqt = PlanetPublisherPluginType.Companion.OLrzqt(javaString);
            return (planetPublisherPluginTypeOLrzqt == null || (viewAEQbTJ = ((tWM) C43251rlk.copydefault(tWM.class)).AEQbTJ(contextAubY, planetPublisherPluginTypeOLrzqt, str, application.copydefault(numValueOf))) == null) ? new View(contextAubY) : viewAEQbTJ;
        }
        View view = new View(AubY());
        pUU.EZpvd("qjf", "OKPlanetPluginView---->params invalid");
        return view;
    }

    public final Context OLrzqt() {
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return C55374xij.AEQbTJ(contextAubY, 32);
    }
}
