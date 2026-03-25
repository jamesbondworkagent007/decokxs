package com.okinc.business.defi.wallet.transaction.moduleModel;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AddressModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.Advance;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DappInfoModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DefaultTx;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DivideModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.MevInfo;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.NetworkFeeModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.SignJsonRouter;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TabListModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.Tabs;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TextModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TitleModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ModuleAdapter implements JsonDeserializer<BaseModel<?>> {
    public final HashMap<String, Class<?>> AEQbTJ = new HashMap<>();

    public ModuleAdapter() {
        EZpvd("text", TextModuleModel.class);
        EZpvd("assetDiff", AssetDiffModuleModel.class);
        EZpvd("txTitle", TitleModuleModel.class);
        EZpvd("divide", DivideModuleModel.class);
        EZpvd("mevInfo", MevInfo.class);
        EZpvd(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, AddressModuleModel.class);
        EZpvd("networkFee", NetworkFeeModuleModel.class);
        EZpvd("advance", Advance.class);
        EZpvd("tabs", Tabs.class);
        EZpvd("txExplain", TxExplain.class);
        EZpvd("dappInfo", DappInfoModuleModel.class);
        EZpvd("approveInfo", ApproveInfoModuleModel.class);
        EZpvd("signJsonRouter", SignJsonRouter.class);
        EZpvd("defaultTx", DefaultTx.class);
        EZpvd("approveTo", TabListModuleModel.class);
    }

    public final void EZpvd(@NotNull String str, @NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        this.AEQbTJ.put(str, cls);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object; */
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public BaseModel<?> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement != null) {
            Class<?> cls = this.AEQbTJ.get(jsonElement.getAsJsonObject().get("moduleName").getAsString());
            if (cls == null) {
                return null;
            }
            BaseModel<?> baseModel = jsonDeserializationContext != null ? (BaseModel) jsonDeserializationContext.deserialize(jsonElement, cls) : null;
            if (baseModel != null) {
                return baseModel;
            }
        }
        if (jsonDeserializationContext != null) {
            return (BaseModel) jsonDeserializationContext.deserialize(jsonElement, type);
        }
        return null;
    }
}
