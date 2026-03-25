package o;

import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C9678baC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cOA {
    public static final cOA AEQbTJ = new cOA();
    public static final cPW KWHzl = new cPW(C9678baC.Companion.AEQbTJ());
    public static final int copydefault = 8;

    private cOA() {
    }

    public final AbstractC58260yxt<java.lang.Boolean> AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C9678baC.Activity activity = C9678baC.Companion;
        final java.io.File file = new java.io.File("data/data/" + activity.AEQbTJ().getPackageName() + "/app_flutter/wallet");
        final java.io.File file2 = new java.io.File("data/data/" + activity.AEQbTJ().getPackageName() + "/databases/wallet");
        if (!file.exists() || SPUtils.getBoolean("flutter_wallet_has_migrated", false)) {
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(java.lang.Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.cOB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) throws java.lang.Throwable {
                cOA.OLrzqt(file, file2, str, str2, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtOLrzqt);
        final Function1 function1 = new Function1() { // from class: o.cOI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cOA.EZpvd((java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtKWHzl = abstractC58260yxtValueOf.KWHzl(new InterfaceC58227yxM() { // from class: o.cOF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cOA.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtKWHzl, "");
        return abstractC58260yxtKWHzl;
    }

    public static final void OLrzqt(java.io.File file, java.io.File file2, java.lang.String str, java.lang.String str2, InterfaceC58257yxq interfaceC58257yxq) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2;
        java.io.FileInputStream fileInputStream;
        java.io.FileOutputStream fileOutputStream3;
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        java.io.FileInputStream fileInputStream2 = null;
        java.io.FileOutputStream fileOutputStream4 = null;
        java.io.FileOutputStream fileOutputStream5 = null;
        java.io.FileInputStream fileInputStream3 = null;
        try {
            fileInputStream = new java.io.FileInputStream(file);
            try {
                fileOutputStream3 = new java.io.FileOutputStream(file2);
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Exception unused2) {
            fileOutputStream2 = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            fileOutputStream3.getChannel().transferFrom(fileInputStream.getChannel(), 0L, fileInputStream.getChannel().size());
            fileInputStream.close();
            fileOutputStream3.close();
            try {
                KWHzl.OLrzqt(str, str2);
                interfaceC58257yxq.onSuccess(java.lang.Boolean.TRUE);
            } catch (java.lang.Exception unused3) {
                interfaceC58257yxq.onSuccess(java.lang.Boolean.FALSE);
            }
        } catch (java.lang.Exception unused4) {
            fileOutputStream4 = fileOutputStream3;
            fileOutputStream2 = fileOutputStream4;
            fileInputStream3 = fileInputStream;
            if (fileInputStream3 != null) {
                fileInputStream3.close();
            }
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            interfaceC58257yxq.onSuccess(java.lang.Boolean.FALSE);
        } catch (java.lang.Throwable th4) {
            th = th4;
            fileOutputStream5 = fileOutputStream3;
            fileOutputStream = fileOutputStream5;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream == null) {
                throw th;
            }
            fileOutputStream.close();
            throw th;
        }
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Boolean bool) {
        SPUtils.put("flutter_wallet_has_migrated", java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
