package o;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import com.okinc.business.rewards.okplatform.bean.RichTextRoot;
import com.okinc.lexical.heading.RichTextHeading;
import com.okinc.lexical.linebreak.RichLineBreak;
import com.okinc.lexical.link.RichTextLink;
import com.okinc.lexical.listorbullet.RichTextList;
import com.okinc.lexical.paragraph.RichTextParagraph;
import com.okinc.lexical.parser.IntegerDefault0Adapter;
import com.okinc.lexical.table.RichTextTable;
import com.okinc.lexical.table.RichTextTableCell;
import com.okinc.lexical.table.RichTextTableRow;
import com.okinc.lexical.text.GeneralRichText;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import o.pHV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pHV {

    public static final class Application extends TypeToken<java.util.List<BaseRichTextBlock>> {
    }

    public final RichTextRoot AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return (RichTextRoot) new GsonBuilder().registerTypeAdapter(java.lang.Integer.TYPE, new IntegerDefault0Adapter()).registerTypeAdapter(new Application().getType(), new JsonDeserializer() { // from class: com.okinc.lexical.parser.LexicalParser$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.gson.JsonDeserializer
                public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                    return pHV.copydefault(jsonElement, type, jsonDeserializationContext);
                }
            }).create().fromJson(str, RichTextRoot.class);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final java.util.List copydefault(JsonElement jsonElement, java.lang.reflect.Type type, JsonDeserializationContext jsonDeserializationContext) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(jsonDeserializationContext, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            JsonElement next = it.next();
            java.lang.String asString = next.getAsJsonObject().get("type").getAsString();
            if (android.text.TextUtils.equals(asString, "text")) {
                java.lang.String string = next.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                pUU.EZpvd("####", string);
                arrayList.add(jsonDeserializationContext.deserialize(next, GeneralRichText.class));
            } else if (android.text.TextUtils.equals(asString, "heading")) {
                arrayList.add(jsonDeserializationContext.deserialize(next, RichTextHeading.class));
            } else if (android.text.TextUtils.equals(asString, "link")) {
                arrayList.add(jsonDeserializationContext.deserialize(next, RichTextLink.class));
            } else if (android.text.TextUtils.equals(asString, "paragraph")) {
                arrayList.add(jsonDeserializationContext.deserialize(next, RichTextParagraph.class));
            } else if (android.text.TextUtils.equals(asString, "list")) {
                arrayList.add(jsonDeserializationContext.deserialize(next, RichTextList.class));
            } else if (android.text.TextUtils.equals(asString, "table")) {
                arrayList.add(jsonDeserializationContext.deserialize(next, RichTextTable.class));
            } else if (android.text.TextUtils.equals(asString, "tablerow")) {
                arrayList.add(jsonDeserializationContext.deserialize(next, RichTextTableRow.class));
            } else if (android.text.TextUtils.equals(asString, "tablecell")) {
                arrayList.add(jsonDeserializationContext.deserialize(next, RichTextTableCell.class));
            } else if (android.text.TextUtils.equals(asString, "linebreak")) {
                arrayList.add(jsonDeserializationContext.deserialize(next, RichLineBreak.class));
            }
        }
        return arrayList;
    }
}
