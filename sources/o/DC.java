package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DC {
    public static final DB copydefault(java.lang.String str) {
        DJ djCopydefault = DO.copydefault(str);
        if (djCopydefault == null) {
            djCopydefault = DO.gEmmrt(str);
        }
        if (djCopydefault != null) {
            return new DB.TaskDescription(djCopydefault);
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        if (!(listSplit$default instanceof java.util.Collection) || !listSplit$default.isEmpty()) {
            java.util.Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                if (!DO.EZpvd((java.lang.String) it.next())) {
                    InterfaceC5079Dx interfaceC5079DxEZpvd = C52481wN.EZpvd.EZpvd();
                    if (interfaceC5079DxEZpvd != null) {
                        interfaceC5079DxEZpvd.OLrzqt("aws.smithy.kotlin.runtime.net.Host->hostParseImpl()->" + str + " is not a valid inet host");
                    }
                    return new DB.Application("aws.amazon.com");
                }
            }
        }
        return new DB.Application(str);
    }

    public static final java.lang.String AEQbTJ(@NotNull DB db) {
        Intrinsics.checkNotNullParameter(db, "");
        if (db instanceof DB.TaskDescription) {
            DB.TaskDescription taskDescription = (DB.TaskDescription) db;
            if (taskDescription.OLrzqt() instanceof DG) {
                java.lang.String str = AbstractJsonLexerKt.BEGIN_LIST + C5167Hh.KWHzl.copydefault().EZpvd(taskDescription.OLrzqt().toString()) + AbstractJsonLexerKt.END_LIST;
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }
            return taskDescription.OLrzqt().toString();
        }
        if (db instanceof DB.Application) {
            return ((DB.Application) db).copydefault();
        }
        throw new NoWhenBranchMatchedException();
    }
}
