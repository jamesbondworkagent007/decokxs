package o;

import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import com.okinc.okimcore.model.biz.relationlocal.OsPhoneRelation;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44511sSn {
    public final android.content.Context copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C44511sSn(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = context;
    }

    /* JADX INFO: renamed from: o.sSn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sSn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a A[Catch: Exception -> 0x00e3, all -> 0x0108, TryCatch #3 {Exception -> 0x00e3, blocks: (B:9:0x0057, B:15:0x0092, B:21:0x00b4, B:24:0x00ba, B:26:0x00c0, B:18:0x009a, B:20:0x00b0, B:14:0x0088), top: B:48:0x0057, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.List<OsPhoneRelation>> continuation) {
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        java.lang.String str;
        java.lang.Object objM7377constructorimpl;
        kotlin.Pair pair;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        android.database.Cursor cursorQuery = this.copydefault.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, "display_name ASC");
        if (cursorQuery != null) {
            try {
                columnIndex = cursorQuery.getColumnIndex("contact_id");
                columnIndex2 = cursorQuery.getColumnIndex("display_name");
                columnIndex3 = cursorQuery.getColumnIndex("data1");
                columnIndex4 = cursorQuery.getColumnIndex("data4");
                columnIndex5 = cursorQuery.getColumnIndex("_id");
            } finally {
            }
            while (true) {
                java.lang.Object objOLrzqt = null;
                if (!cursorQuery.moveToNext()) {
                    break;
                }
                java.lang.String string = cursorQuery.getString(columnIndex);
                java.lang.String string2 = cursorQuery.getString(columnIndex2);
                java.lang.String string3 = cursorQuery.getString(columnIndex3);
                java.lang.String string4 = cursorQuery.getString(columnIndex4);
                java.lang.String string5 = cursorQuery.getString(columnIndex5);
                if (string4 == null) {
                    try {
                        string4 = PhoneNumberUtils.normalizeNumber(string3);
                        str = string4;
                        try {
                            Result.Application application = Result.Companion;
                            Phonenumber.PhoneNumber phoneNumber = PhoneNumberUtil.getInstance().parse(str, null);
                            objM7377constructorimpl = Result.m7377constructorimpl(C56390yDp.OLrzqt(C33129mqd.gEmmrt(C56443yFo.AEQbTJ(phoneNumber.getCountryCode())), C33129mqd.gEmmrt(C56443yFo.KWHzl(phoneNumber.getNationalNumber()))));
                        } catch (java.lang.Throwable th) {
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                            objOLrzqt = objM7377constructorimpl;
                        } else {
                            Intrinsics.copydefault((java.lang.Object) str);
                            java.lang.String strReplace = new Regex("[^0-9]").replace(str, "");
                            if (strReplace.length() > 0) {
                                objOLrzqt = C56390yDp.OLrzqt(null, strReplace);
                            }
                        }
                        pair = (kotlin.Pair) objOLrzqt;
                        if (pair == null && str != null && !linkedHashMap.containsKey(str)) {
                            Intrinsics.copydefault((java.lang.Object) string);
                            Intrinsics.copydefault((java.lang.Object) string3);
                            java.lang.String str2 = (java.lang.String) pair.getFirst();
                            java.lang.String str3 = (java.lang.String) pair.getSecond();
                            Intrinsics.copydefault((java.lang.Object) string5);
                            linkedHashMap.put(str, new OsPhoneRelation(string, string3, string2, str2, str3, string5));
                        }
                    } catch (java.lang.Exception e) {
                        C44124sEe.copydefault("GetOsPhoneRelationsUseCase", "getLocalRelationList, error: " + C56379yDe.AEQbTJ(e));
                    }
                } else {
                    str = string4;
                    Result.Application application3 = Result.Companion;
                    Phonenumber.PhoneNumber phoneNumber2 = PhoneNumberUtil.getInstance().parse(str, null);
                    objM7377constructorimpl = Result.m7377constructorimpl(C56390yDp.OLrzqt(C33129mqd.gEmmrt(C56443yFo.AEQbTJ(phoneNumber2.getCountryCode())), C33129mqd.gEmmrt(C56443yFo.KWHzl(phoneNumber2.getNationalNumber()))));
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    }
                    pair = (kotlin.Pair) objOLrzqt;
                    if (pair == null) {
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(cursorQuery, null);
        }
        C44124sEe.copydefault("GetOsPhoneRelationsUseCase", "getLocalRelationList, result size:" + linkedHashMap.values().size());
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashMap.values());
    }
}
