package o;

import aws.smithy.kotlin.runtime.ClientException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC4025Ax;
import o.DB;
import o.DL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.As, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3762As {
    public static final AbstractC4025Ax OLrzqt(HI hi, DI di) {
        java.lang.String str = di.EZpvd() + ".proxyHost";
        java.lang.String str2 = di.EZpvd() + ".proxyPort";
        final java.lang.String strOLrzqt = hi.OLrzqt(str);
        final java.lang.String strOLrzqt2 = hi.OLrzqt(str2);
        if (strOLrzqt == null) {
            return null;
        }
        final DI diKWHzl = DI.EZpvd.KWHzl();
        try {
            return new AbstractC4025Ax.Application(DL.AEQbTJ.EZpvd(new Function1<DL.Application, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.EnvironmentProxySelectorKt$resolveProxyByProperty$1$url$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DL.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DL.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                    application.EZpvd(diKWHzl);
                    application.EZpvd(DB.copydefault.KWHzl(strOLrzqt));
                    String str3 = strOLrzqt2;
                    if (str3 != null) {
                        application.OLrzqt(Integer.valueOf(Integer.parseInt(str3)));
                    }
                }
            }));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str + "=\"" + strOLrzqt + '\"');
            if (strOLrzqt2 != null) {
                sb.append(", " + str2 + "=\"" + strOLrzqt2 + '\"');
            }
            java.lang.String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            throw new ClientException("Could not parse " + string + " into a valid proxy URL", e);
        }
    }

    public static final AbstractC4025Ax EZpvd(HB hb, DI di) {
        AbstractC4025Ax.Application application;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strEZpvd = di.EZpvd();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = strEZpvd.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        sb.append(lowerCase);
        sb.append("_proxy");
        java.lang.String string = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.String upperCase = di.EZpvd().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        sb2.append(upperCase);
        sb2.append("_PROXY");
        java.util.Iterator it = yDY.gEmmrt(string, sb2.toString()).iterator();
        do {
            application = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            java.lang.String strEZpvd2 = hb.EZpvd(str);
            if (strEZpvd2 != null) {
                try {
                    application = new AbstractC4025Ax.Application(DL.StateListAnimator.parse$default(DL.AEQbTJ, strEZpvd2, null, 2, null));
                } catch (java.lang.Exception e) {
                    throw new ClientException("Could not parse " + (str + "=\"" + strEZpvd2 + '\"') + " into a valid proxy URL", e);
                }
            }
        } while (application == null);
        return application;
    }

    public static final AA OLrzqt(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{AbstractJsonLexerKt.COLON}, false, 2, 2, (java.lang.Object) null);
        int size = listSplit$default.size();
        int i = 2;
        if (size == 1) {
            return new AA((java.lang.String) listSplit$default.get(0), null, i, 0 == true ? 1 : 0);
        }
        if (size == 2) {
            return new AA((java.lang.String) listSplit$default.get(0), java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) listSplit$default.get(1))));
        }
        throw new java.lang.IllegalStateException(("invalid no proxy host: " + str).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.Set<AA> KWHzl(HM hm) {
        java.util.Set setCopydefault;
        java.util.List listSplit$default;
        java.lang.String strOLrzqt = hm.OLrzqt("http.noProxyHosts");
        if (strOLrzqt == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strOLrzqt, new char[]{'|'}, false, 0, 6, (java.lang.Object) null)) == null) {
            setCopydefault = yEE.copydefault();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
            java.util.Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) it.next()).toString());
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(StringsKt__StringsKt.gEmmrt((java.lang.String) it2.next(), '.'));
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            java.util.Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(OLrzqt((java.lang.String) it3.next()));
            }
            setCopydefault = CollectionsKt___CollectionsKt.OqFWZa(arrayList3);
            if (setCopydefault == null) {
            }
        }
        java.util.List listGEmmrt = yDY.gEmmrt("no_proxy", "NO_PROXY");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it4 = listGEmmrt.iterator();
        while (it4.hasNext()) {
            java.lang.String strEZpvd = hm.EZpvd((java.lang.String) it4.next());
            if (strEZpvd != null) {
                arrayList4.add(strEZpvd);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            C56406yEe.KWHzl(arrayList5, StringsKt__StringsKt.split$default((java.lang.CharSequence) it5.next(), new char[]{AbstractJsonLexerKt.COMMA, ' '}, false, 0, 6, (java.lang.Object) null));
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList5, 10));
        java.util.Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            arrayList6.add(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) it6.next()).toString());
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList6, 10));
        java.util.Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            arrayList7.add(StringsKt__StringsKt.gEmmrt((java.lang.String) it7.next(), '.'));
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList7, 10));
        java.util.Iterator it8 = arrayList7.iterator();
        while (it8.hasNext()) {
            arrayList8.add(OLrzqt((java.lang.String) it8.next()));
        }
        return yEJ.KWHzl(setCopydefault, CollectionsKt___CollectionsKt.OqFWZa(arrayList8));
    }
}
