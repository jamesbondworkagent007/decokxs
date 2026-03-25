package com.okinc.unify_find.data;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43251rlk;
import o.C56524yIo;
import o.C57576yky;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class EntityWsArg extends WsArgV5 {
    public static final int $stable = 8;
    private String entityId;

    @Expose(serialize = false)
    private String entityUniqueKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntityId() {
        return this.entityId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EntityWsArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String strAuCTelauCTel;
        String str9 = (i & 1) != 0 ? "" : str;
        String str10 = (i & 2) != 0 ? null : str2;
        String str11 = (i & 4) != 0 ? null : str3;
        String str12 = (i & 8) != 0 ? null : str4;
        String str13 = (i & 16) != 0 ? null : str5;
        String str14 = (i & 32) != 0 ? null : str6;
        String str15 = (i & 64) != 0 ? null : str7;
        JsonObject jsonObject2 = (i & 128) != 0 ? null : jsonObject;
        if ((i & 256) != 0) {
            OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(OKComplianceRestrictionService.class));
            strAuCTelauCTel = oKComplianceRestrictionService != null ? oKComplianceRestrictionService.AuCTelauCTel() : null;
        } else {
            strAuCTelauCTel = str8;
        }
        this(str9, str10, str11, str12, str13, str14, str15, jsonObject2, strAuCTelauCTel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityWsArg(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8) {
        super(str, str2, str3, str4, str5, str6, str7, jsonObject);
        Intrinsics.checkNotNullParameter(str, "");
        this.entityUniqueKey = "";
        this.entityId = str8;
    }

    public EntityWsArg(HashMap<String, String> map) {
        super(map);
        this.entityUniqueKey = "";
        if (map != null) {
            String str = map.get("entityId");
            this.entityId = str != null ? str : "";
        }
    }

    @Override // com.okinc.websocket.v5config.WsArgV5, o.InterfaceC57559ykh
    public String getUniqueKey() {
        if (this.entityUniqueKey.length() == 0) {
            this.entityUniqueKey = C57576yky.AEQbTJ.copydefault(getChannel(), getInstId(), getInstFamily(), getInstType(), getCcy(), getAlgoId(), getGrouping(), this.entityId);
        }
        return this.entityUniqueKey;
    }

    @Override // com.okinc.websocket.v5config.WsArgV5, o.InterfaceC57559ykh
    public String getUniqueKeyByResponse(HashMap<String, String> map) {
        if (map == null) {
            return "";
        }
        C57576yky c57576yky = C57576yky.AEQbTJ;
        String str = map.get(AppsFlyerProperties.CHANNEL);
        return c57576yky.copydefault(str != null ? str : "", map.get("instId"), map.get("instFamily"), map.get("instType"), map.get("ccy"), map.get("algoId"), map.get("grouping"), map.get("entityId"));
    }
}
