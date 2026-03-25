package o;

import com.immomo.mls.log.ErrorType;
import com.immomo.mls.utils.AlertForDebug;
import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.arL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7833arL {
    public static void copydefault(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException(str);
    }

    public static void KWHzl(java.lang.String str) {
        if (C7326ahi.EZpvd) {
            copydefault(str);
            return;
        }
        C6777aVl.EZpvd(new java.lang.Exception("debugLuaError debugUnsupportError:" + str), null, java.lang.Boolean.FALSE);
    }

    public static void valueOf(java.lang.String str, Globals globals) {
        if (C7326ahi.EZpvd) {
            if (globals.getNewProxyInstance()) {
                throw AlertForDebug.showInDebug(str);
            }
            C7320ahc.OLrzqt(AlertForDebug.showInDebug(str), globals);
        } else {
            C6777aVl.EZpvd(new java.lang.Exception("debugLuaError debugLuaError:" + str), null, java.lang.Boolean.FALSE);
            C7320ahc.EZpvd(AlertForDebug.showInDebug(str), globals);
        }
    }

    public static void OLrzqt(java.lang.String str, Globals globals) {
        if (C7326ahi.EZpvd) {
            C7320ahc.KWHzl(ErrorType.WARNING, AlertForDebug.showInDebug(str), globals);
        } else {
            C7320ahc.EZpvd(AlertForDebug.showInDebug(str), globals);
        }
    }

    public static void AEQbTJ(java.lang.String str, Globals globals) {
        java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("The setter of '" + str + "' method is deprecated!");
        if (C7326ahi.EZpvd) {
            C7320ahc.KWHzl(ErrorType.WARNING, unsupportedOperationException, globals);
        } else {
            C7320ahc.EZpvd(unsupportedOperationException, globals);
        }
    }

    public static void EZpvd(java.lang.String str, Globals globals) {
        java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("The method '" + str + "' is deprecated!");
        if (C7326ahi.EZpvd) {
            C7320ahc.KWHzl(ErrorType.WARNING, unsupportedOperationException, globals);
        } else {
            C7320ahc.EZpvd(unsupportedOperationException, globals);
        }
    }

    public static void copydefault(java.lang.String str, java.lang.String str2, Globals globals) {
        java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("The method '" + str + "' is deprecated, use " + str2 + " instead!");
        if (C7326ahi.EZpvd) {
            C7320ahc.KWHzl(ErrorType.WARNING, unsupportedOperationException, globals);
        } else {
            C7320ahc.EZpvd(unsupportedOperationException, globals);
        }
    }

    public static void copydefault(java.lang.String str, Globals globals) {
        java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("The getter of '" + str + "' method is deprecated!");
        if (C7326ahi.EZpvd) {
            C7320ahc.KWHzl(ErrorType.WARNING, unsupportedOperationException, globals);
        } else {
            C7320ahc.EZpvd(unsupportedOperationException, globals);
        }
    }

    public static void KWHzl(java.lang.String str, Globals globals) {
        if (C7326ahi.EZpvd) {
            C7320ahc.KWHzl(ErrorType.WARNING, AlertForDebug.showInDebug("DEBUG⚠️: " + str), globals);
        }
    }
}
