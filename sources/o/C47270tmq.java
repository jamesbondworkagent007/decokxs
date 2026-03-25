package o;

import android.content.SharedPreferences;
import com.okinc.okuser.data.User;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tmq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C47270tmq {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final android.content.Context EZpvd;
    public final InterfaceC47238tmK OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AhwBna() {
        return "decode user from local success";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault() {
        return "fetchUsersFromLocalStorage in child process";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String djBIcL() {
        return "fetch users data from local - end";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String valueOf() {
        return "fetch users data from local - start";
    }

    @yCM
    public C47270tmq(@NotNull android.content.Context context, @NotNull InterfaceC47238tmK interfaceC47238tmK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC47238tmK, "");
        this.EZpvd = context;
        this.OLrzqt = interfaceC47238tmK;
    }

    public final java.util.List<User> AYXKKw() {
        C47243tmP c47243tmP = C47243tmP.EZpvd;
        c47243tmP.EZpvd(new Function0() { // from class: o.tmp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47270tmq.valueOf();
            }
        });
        final java.util.Map<java.lang.String, ?> all = this.EZpvd.getSharedPreferences("sp_name_users", 0).getAll();
        c47243tmP.EZpvd(new Function0() { // from class: o.tmo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47270tmq.KWHzl(all);
            }
        });
        Intrinsics.copydefault(all);
        java.util.ArrayList arrayList = new java.util.ArrayList(all.size());
        java.util.Iterator<Map.Entry<java.lang.String, ?>> it = all.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next().getValue();
            if (str == null) {
                str = "";
            }
            java.lang.String strKWHzl = this.OLrzqt.KWHzl(str);
            Json jsonCopydefault = C47228tmA.copydefault();
            jsonCopydefault.getSerializersModule();
            User user = (User) jsonCopydefault.decodeFromString(User.Companion.serializer(), strKWHzl);
            C47243tmP.EZpvd.EZpvd(new Function0() { // from class: o.tmv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C47270tmq.AhwBna();
                }
            });
            arrayList.add(user);
        }
        C47243tmP.EZpvd.EZpvd(new Function0() { // from class: o.tmt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47270tmq.djBIcL();
            }
        });
        return arrayList;
    }

    public static final java.lang.String KWHzl(java.util.Map map) {
        return "all users data size: " + (map != null ? java.lang.Integer.valueOf(map.size()) : null);
    }

    public final java.util.List<User> gEmmrt() {
        java.util.List<User> listAhwBna;
        try {
            if (values()) {
                listAhwBna = AYXKKw();
            } else {
                C47243tmP.EZpvd.EZpvd(new Function0() { // from class: o.tmn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C47270tmq.copydefault();
                    }
                });
                listAhwBna = yDY.AhwBna();
            }
            return listAhwBna;
        } catch (java.lang.Throwable th) {
            C47243tmP.EZpvd.EZpvd(new Function0() { // from class: o.tmr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C47270tmq.OLrzqt(th);
                }
            });
            return yDY.AhwBna();
        }
    }

    public static final java.lang.String OLrzqt(java.lang.Throwable th) {
        return "fetchUsersFromLocalStorage error, error=" + th.getMessage();
    }

    public final void KWHzl(@NotNull final java.util.List<User> list) {
        Intrinsics.checkNotNullParameter(list, "");
        try {
            SharedPreferences.Editor editorEdit = this.EZpvd.getSharedPreferences("sp_name_users", 0).edit();
            C47243tmP.EZpvd.EZpvd(new Function0() { // from class: o.tmw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C47270tmq.OLrzqt(list);
                }
            });
            editorEdit.clear().apply();
            for (User user : list) {
                Json jsonCopydefault = C47228tmA.copydefault();
                jsonCopydefault.getSerializersModule();
                java.lang.String strOLrzqt = this.OLrzqt.OLrzqt(jsonCopydefault.encodeToString(User.Companion.serializer(), user));
                final java.lang.String strKWHzl = C54809xWc.KWHzl(user.getLoginName());
                editorEdit.putString(strKWHzl, strOLrzqt);
                C47243tmP.EZpvd.EZpvd(new Function0() { // from class: o.tmu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C47270tmq.OLrzqt(strKWHzl);
                    }
                });
            }
            final boolean zCommit = editorEdit.commit();
            C47243tmP.EZpvd.EZpvd(new Function0() { // from class: o.tms
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C47270tmq.KWHzl(zCommit);
                }
            });
        } catch (java.lang.Throwable th) {
            C47243tmP.EZpvd.EZpvd(new Function0() { // from class: o.tmz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C47270tmq.EZpvd(th);
                }
            });
        }
    }

    public static final java.lang.String OLrzqt(java.util.List list) {
        return "persist to local - start, usersSize=" + list.size();
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        return "persist for the user " + str;
    }

    public static final java.lang.String KWHzl(boolean z) {
        return "persist to local - end, isSuccess=" + z;
    }

    public static final java.lang.String EZpvd(java.lang.Throwable th) {
        return "persist to local error, error=" + th.getMessage();
    }

    public final boolean values() {
        return C33551myb.EZpvd(C43246rlf.OLrzqt.valueOf());
    }

    /* JADX INFO: renamed from: o.tmq$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tmq.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
