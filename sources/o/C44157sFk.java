package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.okimcore.extension.CommonXKt$withRetry$1;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.exception.OKIMGroupNotExistException;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import com.okinc.okuser.data.User;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sFk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44157sFk {

    /* JADX INFO: renamed from: o.sFk$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    public static final float copydefault() {
        return 140.0f;
    }

    public static final InterfaceC47278tmy gEmmrt() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB();
    }

    public static final java.lang.String copydefault(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        java.lang.String uid;
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        User userOLrzqt = interfaceC47278tmy.OLrzqt();
        return (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) ? "" : uid;
    }

    public static final java.lang.String EZpvd() {
        java.lang.String strGEmmrt = ((sEZ) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), sEZ.class)).ggKfIT().gEmmrt();
        return strGEmmrt == null ? "" : strGEmmrt;
    }

    public static final java.lang.String KWHzl() {
        return gEmmrt().values() ? EZpvd() : sFM.copydefault.copydefault();
    }

    public static final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) KWHzl(), (java.lang.Object) str);
    }

    public static final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return sDZ.AEQbTJ.valueOf().OLrzqt(str, str2) == null;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.sEe.imLogCurrentUser$default(java.lang.String, java.lang.Throwable, int, java.lang.Object):void */
    public static final boolean AEQbTJ() {
        C44124sEe.imLogCurrentUser$default("getCurrentUserContactInfo, currentUserIsOfficial", null, 2, null);
        RelationInfo relationInfoCopydefault = sDZ.AEQbTJ.valueOf().copydefault();
        return C44170sFx.EZpvd(relationInfoCopydefault != null ? relationInfoCopydefault.getOfficialTags() : null);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof ResponseFailedException) {
            return th.getMessage();
        }
        if (th instanceof OKServerException) {
            return th.getMessage();
        }
        if (th instanceof OKIMGroupNotExistException) {
            return ((OKIMGroupNotExistException) th).getMessage();
        }
        if (th instanceof OKIMException) {
            return th.getMessage();
        }
        return null;
    }

    public static final java.lang.Integer OLrzqt(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof ResponseFailedException) {
            return java.lang.Integer.valueOf(((ResponseFailedException) th).getCode());
        }
        if (th instanceof OKServerException) {
            return java.lang.Integer.valueOf(((OKServerException) th).getCode());
        }
        return null;
    }

    public static final void KWHzl(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.String strCopydefault = copydefault(th);
        if (strCopydefault != null) {
            C55326xho.toastWithFailedIcon$default(strCopydefault, 0, 1, (java.lang.Object) null);
        }
    }

    public static /* synthetic */ java.lang.String getDisplayName$default(RelationInfo relationInfo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return KWHzl(relationInfo, str);
    }

    public static final java.lang.String KWHzl(@NotNull RelationInfo relationInfo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(relationInfo, "");
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) relationInfo.getRemarkName())) {
            return relationInfo.getRemarkName();
        }
        java.lang.String phoneName = relationInfo.getPhoneName();
        if (phoneName != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) phoneName)) {
            return relationInfo.getPhoneName();
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return str == null ? C44170sFx.copydefault(relationInfo) : str;
        }
        return C44170sFx.copydefault(relationInfo);
    }

    public static final java.lang.String OLrzqt(@NotNull sQU squ) {
        java.lang.String remarkName;
        java.lang.String nickname;
        java.lang.String enNickname;
        Intrinsics.checkNotNullParameter(squ, "");
        InHouseIMContactInfoEntity inHouseIMContactInfoEntityOLrzqt = squ.OLrzqt();
        if (inHouseIMContactInfoEntityOLrzqt == null || (remarkName = inHouseIMContactInfoEntityOLrzqt.getRemarkName()) == null) {
            remarkName = "";
        }
        PhoneRelationEntity phoneRelationEntityKWHzl = squ.KWHzl();
        java.lang.String name = phoneRelationEntityKWHzl != null ? phoneRelationEntityKWHzl.getName() : null;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntityOLrzqt2 = squ.OLrzqt();
        if (inHouseIMContactInfoEntityOLrzqt2 == null || (nickname = inHouseIMContactInfoEntityOLrzqt2.getNickname()) == null) {
            nickname = "";
        }
        InHouseIMContactInfoEntity inHouseIMContactInfoEntityOLrzqt3 = squ.OLrzqt();
        if (inHouseIMContactInfoEntityOLrzqt3 == null || (enNickname = inHouseIMContactInfoEntityOLrzqt3.getEnNickname()) == null) {
            enNickname = "";
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) remarkName)) {
            return remarkName;
        }
        if (name != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) name)) {
            return name;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        return (C38303pTu.KWHzl(locale) || enNickname.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) enNickname)) ? nickname : enNickname;
    }

    public static final boolean EZpvd(@NotNull OKMessage oKMessage) {
        GroupUserSettingInfo userSettingInfo;
        GroupUserSettingInfo userSettingInfo2;
        GroupRole role;
        GroupRole role2;
        java.lang.String contactId;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        RelationInfo relationInfoKWHzl = null;
        GroupInfo groupInfoOLrzqt = oKMessage.getConversationType() == OKConversationType.GROUP ? sDZ.AEQbTJ.valueOf().OLrzqt(oKMessage.getTargetId()) : null;
        sDZ sdz = sDZ.AEQbTJ;
        OKConversation oKConversationCopydefault = sdz.valueOf().copydefault(oKMessage.getTargetId());
        if (oKConversationCopydefault != null && (contactId = oKConversationCopydefault.getContactId()) != null) {
            relationInfoKWHzl = sdz.valueOf().KWHzl(contactId);
        }
        boolean z = (groupInfoOLrzqt == null || (((userSettingInfo = groupInfoOLrzqt.getUserSettingInfo()) == null || (role2 = userSettingInfo.getRole()) == null || role2.getCode() != GroupRole.Owner.getCode()) && (((userSettingInfo2 = groupInfoOLrzqt.getUserSettingInfo()) == null || (role = userSettingInfo2.getRole()) == null || role.getCode() != GroupRole.Administrator.getCode()) && groupInfoOLrzqt.isMute()))) ? false : true;
        int i = StateListAnimator.KWHzl[oKMessage.getConversationType().ordinal()];
        if (i != 1) {
            if (i != 2 || groupInfoOLrzqt == null || !z) {
                return false;
            }
        } else if (relationInfoKWHzl == null || relationInfoKWHzl.isBlackList()) {
            return false;
        }
        return true;
    }

    public static final java.lang.String copydefault(@NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(relationInfo, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (C38303pTu.KWHzl(locale)) {
            return relationInfo.getNickName();
        }
        java.lang.String enNickName = relationInfo.getEnNickName();
        java.lang.String nickName = relationInfo.getNickName();
        return (enNickName == null || enNickName.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) enNickName)) ? nickName : enNickName;
    }

    public static final java.lang.String EZpvd(@NotNull GroupMemberInfo groupMemberInfo) {
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        java.lang.String remarkName = groupMemberInfo.getRemarkName();
        if (remarkName != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) remarkName)) {
            return groupMemberInfo.getRemarkName();
        }
        java.lang.String phoneName = groupMemberInfo.getPhoneName();
        return (phoneName == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) phoneName)) ? C44170sFx.copydefault(groupMemberInfo) : groupMemberInfo.getPhoneName();
    }

    public static final java.lang.String KWHzl(@NotNull InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity) {
        Intrinsics.checkNotNullParameter(inHouseIMGroupMemberEntity, "");
        java.lang.String strKWHzl = C44170sFx.KWHzl(inHouseIMGroupMemberEntity);
        return (strKWHzl == null || strKWHzl.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) ? "" : strKWHzl;
    }

    public static final CoroutineScope EZpvd(@NotNull Function0<? extends CoroutineScope> function0, java.lang.String str) {
        Intrinsics.checkNotNullParameter(function0, "");
        CoroutineScope coroutineScopeInvoke = function0.invoke();
        if (coroutineScopeInvoke != null) {
            return coroutineScopeInvoke;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str != null) {
            sb.append(str + " => ");
        }
        sb.append("scope is null");
        throw new CancellationException(sb.toString());
    }

    public static /* synthetic */ CoroutineScope getOrThrow$default(Function0 function0, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return EZpvd(function0, str);
    }

    public static /* synthetic */ CoroutineScope getOrThrow$default(CoroutineScope coroutineScope, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return OLrzqt(coroutineScope, str);
    }

    public static final CoroutineScope OLrzqt(CoroutineScope coroutineScope, java.lang.String str) {
        if (coroutineScope != null) {
            return coroutineScope;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str != null) {
            sb.append(str + " => ");
        }
        sb.append("scope is null");
        throw new CancellationException(sb.toString());
    }

    public static final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            JsonElement toJsonElement = Json.Default.parseToJsonElement(str);
            if (toJsonElement instanceof JsonObject) {
                if (((JsonObject) toJsonElement).isEmpty()) {
                    return true;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a8 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object OLrzqt(int i, long j, @NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, @NotNull Continuation<? super T> continuation) throws java.lang.Throwable {
        CommonXKt$withRetry$1 commonXKt$withRetry$1;
        long j2;
        int i2;
        int i3;
        Function1<? super Continuation<? super T>, ? extends java.lang.Object> function12;
        java.lang.Throwable th;
        int i4;
        long j3;
        Function1<? super Continuation<? super T>, ? extends java.lang.Object> function13;
        if (continuation instanceof CommonXKt$withRetry$1) {
            commonXKt$withRetry$1 = (CommonXKt$withRetry$1) continuation;
            int i5 = commonXKt$withRetry$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                commonXKt$withRetry$1.label = i5 - Integer.MIN_VALUE;
            } else {
                commonXKt$withRetry$1 = new CommonXKt$withRetry$1(continuation);
            }
        }
        java.lang.Object objInvoke = commonXKt$withRetry$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i6 = commonXKt$withRetry$1.label;
        if (i6 != 0) {
            if (i6 == 1) {
                i3 = commonXKt$withRetry$1.I$1;
                j3 = commonXKt$withRetry$1.J$0;
                i4 = commonXKt$withRetry$1.I$0;
                function13 = (Function1) commonXKt$withRetry$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objInvoke);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    i3++;
                    C44124sEe.imLogSync$default("retry => failed " + i3 + " times", th, null, 4, null);
                    if (i3 < i4) {
                    }
                }
            }
            if (i6 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = commonXKt$withRetry$1.I$1;
            j3 = commonXKt$withRetry$1.J$0;
            i4 = commonXKt$withRetry$1.I$0;
            function13 = (Function1) commonXKt$withRetry$1.L$0;
            C56391yDq.AEQbTJ(objInvoke);
            function12 = function13;
            j2 = j3;
            i2 = i4;
            long j4 = j2;
            if (i3 < i2) {
                JobKt.ensureActive(commonXKt$withRetry$1.getContext());
                try {
                } catch (java.lang.Throwable th3) {
                    i4 = i2;
                    j3 = j4;
                    function13 = function12;
                    th = th3;
                    i3++;
                    C44124sEe.imLogSync$default("retry => failed " + i3 + " times", th, null, 4, null);
                    if (i3 < i4) {
                        throw th;
                    }
                    commonXKt$withRetry$1.L$0 = function13;
                    commonXKt$withRetry$1.I$0 = i4;
                    commonXKt$withRetry$1.J$0 = j3;
                    commonXKt$withRetry$1.I$1 = i3;
                    commonXKt$withRetry$1.label = 2;
                    if (DelayKt.delay(j3, commonXKt$withRetry$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    function12 = function13;
                    j2 = j3;
                    i2 = i4;
                    long j42 = j2;
                    if (i3 < i2) {
                    }
                }
                commonXKt$withRetry$1.L$0 = function12;
                commonXKt$withRetry$1.I$0 = i2;
                commonXKt$withRetry$1.J$0 = j42;
                commonXKt$withRetry$1.I$1 = i3;
                commonXKt$withRetry$1.label = 1;
                objInvoke = function12.invoke(commonXKt$withRetry$1);
                return objInvoke == objCopydefault ? objCopydefault : objInvoke;
            }
            throw new NoSuchElementException("no result");
        }
        C56391yDq.AEQbTJ(objInvoke);
        j2 = j;
        i2 = i;
        i3 = 0;
        function12 = function1;
        long j422 = j2;
        if (i3 < i2) {
        }
    }

    public static /* synthetic */ java.lang.Object withRetry$default(int i, long j, Function1 function1, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            j = 1000;
        }
        return OLrzqt(i, j, function1, continuation);
    }

    public static final int OLrzqt() {
        return android.os.Process.myTid();
    }
}
