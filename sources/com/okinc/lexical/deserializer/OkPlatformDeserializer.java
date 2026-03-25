package com.okinc.lexical.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.okinc.business.rewards.okplatform.bean.ui.OkPlatformCardSection;
import com.okinc.business.rewards.okplatform.bean.ui.OkPlatformEntry;
import com.okinc.business.rewards.okplatform.bean.ui.OkPlatformJoinBtn;
import com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRedirectBtn;
import com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextSection;
import com.okinc.business.rewards.okplatform.bean.ui.OkPlatformTextFullTranslationData;
import com.okinc.business.rewards.okplatform.bean.ui.OkPlatformTextTranslationKeyData;
import com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class OkPlatformDeserializer {

    public static final class OkPlatformTranslationDeserializer implements JsonDeserializer<OkPlatformUIStructureTextData> {
        public static final OkPlatformTranslationDeserializer EZpvd = new OkPlatformTranslationDeserializer();

        private OkPlatformTranslationDeserializer() {
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object; */
        @Override // com.google.gson.JsonDeserializer
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public OkPlatformUIStructureTextData deserialize(@NotNull JsonElement jsonElement, @NotNull Type type, @NotNull JsonDeserializationContext jsonDeserializationContext) {
            Intrinsics.checkNotNullParameter(jsonElement, "");
            Intrinsics.checkNotNullParameter(type, "");
            Intrinsics.checkNotNullParameter(jsonDeserializationContext, "");
            String asString = jsonElement.getAsJsonObject().getAsJsonPrimitive("type").getAsString();
            if (Intrinsics.EZpvd((Object) asString, (Object) "TRANSLATION_KEY")) {
                Object objDeserialize = jsonDeserializationContext.deserialize(jsonElement, OkPlatformTextTranslationKeyData.class);
                Intrinsics.copydefault(objDeserialize);
                return (OkPlatformUIStructureTextData) objDeserialize;
            }
            if (Intrinsics.EZpvd((Object) asString, (Object) "FULL_TRANSLATION")) {
                Object objDeserialize2 = jsonDeserializationContext.deserialize(jsonElement, OkPlatformTextFullTranslationData.class);
                Intrinsics.copydefault(objDeserialize2);
                return (OkPlatformUIStructureTextData) objDeserialize2;
            }
            return new OkPlatformUIStructureTextData();
        }
    }

    public static final class OkPlatformEntryDeserializer implements JsonDeserializer<OkPlatformEntry> {
        public static final OkPlatformEntryDeserializer copydefault = new OkPlatformEntryDeserializer();

        private OkPlatformEntryDeserializer() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [37=4] */
        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object; */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.google.gson.JsonDeserializer
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public OkPlatformEntry deserialize(@NotNull JsonElement jsonElement, @NotNull Type type, @NotNull JsonDeserializationContext jsonDeserializationContext) {
            Intrinsics.checkNotNullParameter(jsonElement, "");
            Intrinsics.checkNotNullParameter(type, "");
            Intrinsics.checkNotNullParameter(jsonDeserializationContext, "");
            String asString = jsonElement.getAsJsonObject().getAsJsonPrimitive("type").getAsString();
            if (asString != null) {
                switch (asString.hashCode()) {
                    case -1948649925:
                        if (asString.equals("affiliatesPortalActivityRichTextSection")) {
                            Object objDeserialize = jsonDeserializationContext.deserialize(jsonElement, OkPlatformRichTextSection.class);
                            Intrinsics.copydefault(objDeserialize);
                            return (OkPlatformEntry) objDeserialize;
                        }
                        break;
                    case -1031322380:
                        if (asString.equals("affiliatesPortalActivityCardSection")) {
                            Object objDeserialize2 = jsonDeserializationContext.deserialize(jsonElement, OkPlatformCardSection.class);
                            Intrinsics.copydefault(objDeserialize2);
                            return (OkPlatformEntry) objDeserialize2;
                        }
                        break;
                    case 757740797:
                        if (asString.equals("affiliatesPortalActivityRedirectionButton")) {
                            Object objDeserialize3 = jsonDeserializationContext.deserialize(jsonElement, OkPlatformRedirectBtn.class);
                            Intrinsics.copydefault(objDeserialize3);
                            return (OkPlatformEntry) objDeserialize3;
                        }
                        break;
                    case 1888864733:
                        if (asString.equals("affiliatesPortalActivityJoinButton")) {
                            Object objDeserialize4 = jsonDeserializationContext.deserialize(jsonElement, OkPlatformJoinBtn.class);
                            Intrinsics.copydefault(objDeserialize4);
                            return (OkPlatformEntry) objDeserialize4;
                        }
                        break;
                }
            }
            return new OkPlatformEntry();
        }
    }
}
