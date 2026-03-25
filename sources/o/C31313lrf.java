package o;

import android.provider.ContactsContract;
import com.okinc.business.web3pay.lib.features.contacts.data.datasource.contentresolver.Web3PayContactsDataSourceImpl$getContacts$1;
import com.okinc.business.web3pay.lib.features.contacts.data.datasource.contentresolver.Web3PayContactsDataSourceImpl$getContacts$2$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31313lrf implements InterfaceC31312lre {
    public final android.content.ContentResolver EZpvd;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC31312lre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<C31314lrg>> continuation) throws java.lang.Throwable {
        Web3PayContactsDataSourceImpl$getContacts$1 web3PayContactsDataSourceImpl$getContacts$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof Web3PayContactsDataSourceImpl$getContacts$1) {
            web3PayContactsDataSourceImpl$getContacts$1 = (Web3PayContactsDataSourceImpl$getContacts$1) continuation;
            int i = web3PayContactsDataSourceImpl$getContacts$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3PayContactsDataSourceImpl$getContacts$1.label = i - Integer.MIN_VALUE;
            } else {
                web3PayContactsDataSourceImpl$getContacts$1 = new Web3PayContactsDataSourceImpl$getContacts$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = web3PayContactsDataSourceImpl$getContacts$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3PayContactsDataSourceImpl$getContacts$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCoroutineScope);
                Result.Application application = Result.Companion;
                Web3PayContactsDataSourceImpl$getContacts$2$1 web3PayContactsDataSourceImpl$getContacts$2$1 = new Web3PayContactsDataSourceImpl$getContacts$2$1(this, null);
                web3PayContactsDataSourceImpl$getContacts$1.label = 1;
                objCoroutineScope = CoroutineScopeKt.coroutineScope(web3PayContactsDataSourceImpl$getContacts$2$1, web3PayContactsDataSourceImpl$getContacts$1);
                if (objCoroutineScope == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCoroutineScope);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objCoroutineScope);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return objM7377constructorimpl;
        }
        pUU.AEQbTJ("Web3PayContactsDataSourceImpl", "getContacts()", thM7380exceptionOrNullimpl);
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.util.Collection<C31252lqX> AEQbTJ(CoroutineScope coroutineScope) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = this.EZpvd.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new java.lang.String[]{"contact_id", "display_name", "data1"}, null, null, null);
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    CoroutineScopeKt.ensureActive(coroutineScope);
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndex("contact_id"));
                    java.lang.String string = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                    java.lang.String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("data1"));
                    if (string2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string2)) {
                        arrayList.add(new C31252lqX(j, string, string2));
                    }
                } finally {
                }
            }
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(cursorQuery, null);
        }
        return arrayList;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.util.Collection<C31253lqY> EZpvd(CoroutineScope coroutineScope) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = this.EZpvd.query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, new java.lang.String[]{"contact_id", "display_name", "data1"}, null, null, null);
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    CoroutineScopeKt.ensureActive(coroutineScope);
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndex("contact_id"));
                    java.lang.String string = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                    java.lang.String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("data1"));
                    if (string2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string2)) {
                        arrayList.add(new C31253lqY(j, string, string2));
                    }
                } finally {
                }
            }
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(cursorQuery, null);
        }
        return arrayList;
    }
}
