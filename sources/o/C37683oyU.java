package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.di.LocalizeDIModule;
import com.okinc.im.imui.utils.IMExtKt$loadAllAdmins$1$1;
import com.okinc.im.imui.utils.IMExtKt$loadConversation$1$1;
import com.okinc.im.imui.utils.IMExtKt$loadGroupInfo$6;
import com.okinc.im.imui.utils.IMExtKt$loadMemberInfoById$1;
import com.okinc.okimcore.model.exception.OKIMGroupNotExistException;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.p2p.api.OTCService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32113mPz;
import o.C35399nuc;
import o.C52761wXj;
import o.sDX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oyU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37683oyU {

    /* JADX INFO: renamed from: o.oyU$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupRole.values().length];
            try {
                iArr[GroupRole.Owner.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[GroupRole.Administrator.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public static final java.lang.String AEQbTJ(@NotNull RelationInfo relationInfo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(relationInfo, "");
        if (str == null || str.length() == 0) {
            return null;
        }
        java.lang.String displayName$default = C44157sFk.getDisplayName$default(relationInfo, null, 1, null);
        java.lang.String strCopydefault = C44170sFx.copydefault(relationInfo);
        java.lang.String contactsId = relationInfo.getContactsId();
        if (!android.text.TextUtils.equals(displayName$default, relationInfo.getRemarkName()) && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) relationInfo.getRemarkName(), (java.lang.CharSequence) str, true)) {
            return relationInfo.getRemarkName();
        }
        if (!android.text.TextUtils.equals(displayName$default, strCopydefault) && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) strCopydefault, (java.lang.CharSequence) str, true)) {
            return strCopydefault;
        }
        if (!android.text.TextUtils.equals(displayName$default, contactsId) && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) contactsId, (java.lang.CharSequence) str, true) && C44157sFk.AEQbTJ()) {
            return contactsId;
        }
        return null;
    }

    public static final java.lang.String copydefault(@NotNull C44461sQr c44461sQr) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(c44461sQr, "");
        boolean zKWHzl = C38303pTu.KWHzl(((LocalizeDIModule.Activity) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.Activity.class)).gkJEwt().OLrzqt().getLocale());
        java.lang.String strGEmmrt = c44461sQr.gEmmrt();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c44461sQr.KWHzl())) {
            strOLrzqt = c44461sQr.KWHzl();
            if (strOLrzqt == null) {
                return "";
            }
        } else {
            if (c44461sQr.valueOf()) {
                return c44461sQr.OLrzqt();
            }
            if (strGEmmrt != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt)) {
                return strGEmmrt;
            }
            if (zKWHzl) {
                return c44461sQr.OLrzqt();
            }
            java.lang.String strCopydefault = c44461sQr.copydefault();
            strOLrzqt = c44461sQr.OLrzqt();
            if (strCopydefault != null && strCopydefault.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
                return strCopydefault;
            }
        }
        return strOLrzqt;
    }

    public static final java.lang.String AEQbTJ(@NotNull GroupMemberInfo groupMemberInfo, java.lang.String str) {
        java.lang.String remarkName;
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        if (str != null && str.length() != 0) {
            java.lang.String strEZpvd = C44157sFk.EZpvd(groupMemberInfo);
            java.lang.String strCopydefault = C44170sFx.copydefault(groupMemberInfo);
            java.lang.String memberId = groupMemberInfo.getMemberId();
            if (!android.text.TextUtils.equals(strEZpvd, groupMemberInfo.getRemarkName()) && (remarkName = groupMemberInfo.getRemarkName()) != null && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) remarkName, (java.lang.CharSequence) str, true)) {
                return groupMemberInfo.getRemarkName();
            }
            if (!android.text.TextUtils.equals(strEZpvd, groupMemberInfo.getNickName()) && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) groupMemberInfo.getNickName(), (java.lang.CharSequence) str, true)) {
                return groupMemberInfo.getNickName();
            }
            if (!android.text.TextUtils.equals(strEZpvd, strCopydefault) && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) strCopydefault, (java.lang.CharSequence) str, true)) {
                return strCopydefault;
            }
            if (!android.text.TextUtils.equals(strEZpvd, memberId) && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) memberId, (java.lang.CharSequence) str, true) && C44157sFk.AEQbTJ()) {
                return memberId;
            }
        }
        return null;
    }

    public static final java.lang.String AEQbTJ(GroupSystemMessageInfo groupSystemMessageInfo) {
        RelationInfo relationInfoKWHzl;
        java.lang.String displayName$default;
        if (groupSystemMessageInfo == null) {
            return "";
        }
        java.lang.String operatorId = groupSystemMessageInfo.getOperatorId();
        if (operatorId != null && (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId)) != null && (displayName$default = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) != null) {
            return displayName$default;
        }
        java.lang.String strCopydefault = sNV.copydefault(C33142mqq.EZpvd.OLrzqt(), groupSystemMessageInfo.getOperatorNickname(), groupSystemMessageInfo.getOperatorEnNickname());
        return strCopydefault == null ? "" : strCopydefault;
    }

    public static /* synthetic */ java.lang.CharSequence setupHighlightSpanStyle$default(java.lang.CharSequence charSequence, android.content.Context context, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = C33070mpX.OLrzqt(C32113mPz.ActionBar.AxsJAY, context);
        }
        return EZpvd(charSequence, context, str, i);
    }

    public static final java.lang.CharSequence EZpvd(@NotNull java.lang.CharSequence charSequence, @NotNull android.content.Context context, java.lang.String str, final int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(context, "");
        return (str == null || str.length() == 0) ? charSequence : C33061mpO.setupSpanStyles$default(charSequence, new java.lang.String[]{str}, 0, MatchPattern.CONTAINS, true, new Function1() { // from class: o.oze
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37683oyU.KWHzl(i, (java.util.List) obj);
            }
        }, 2, null);
    }

    public static final Unit KWHzl(int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(i));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.CharSequence setupHighlightBgSpanStyle$default(java.lang.CharSequence charSequence, android.content.Context context, java.lang.String str, int i, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = C33070mpX.OLrzqt(C32113mPz.ActionBar.AxsJAY, context);
        }
        if ((i2 & 8) != 0) {
            num = java.lang.Integer.valueOf(C33070mpX.OLrzqt(C52761wXj.Activity.UCQKYV, context));
        }
        return EZpvd(charSequence, context, str, i, num);
    }

    public static final java.lang.CharSequence EZpvd(@NotNull java.lang.CharSequence charSequence, @NotNull android.content.Context context, java.lang.String str, final int i, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(context, "");
        return (str == null || str.length() == 0) ? charSequence : C33061mpO.setupSpanStyles$default(charSequence, new java.lang.String[]{str}, 0, MatchPattern.CONTAINS, true, new Function1() { // from class: o.ozm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37683oyU.OLrzqt(i, num, (java.util.List) obj);
            }
        }, 2, null);
    }

    public static final Unit OLrzqt(int i, java.lang.Integer num, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.BackgroundColorSpan(i));
        if (num != null) {
            list.add(new android.text.style.ForegroundColorSpan(num.intValue()));
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super GroupMemberInfo, Unit> function1, @NotNull Function1<? super java.lang.Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new IMExtKt$loadMemberInfoById$1(str2, str, function12, function1, null), 3, null);
    }

    public static /* synthetic */ void loadConversation$default(java.lang.String str, LifecycleOwner lifecycleOwner, OKConversationType oKConversationType, boolean z, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        AEQbTJ(str, lifecycleOwner, oKConversationType, z, function1, function12);
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, @NotNull LifecycleOwner lifecycleOwner, @NotNull OKConversationType oKConversationType, boolean z, @NotNull final Function1<? super OKConversation, Unit> function1, @NotNull final Function1<? super java.lang.Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null) {
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(C33024moe.KWHzl(C44525sTa.copydefault.EZpvd(new IMExtKt$loadConversation$1$1(interfaceC35180nqU, oKConversationType, str, z, null))), lifecycleOwner);
            final Function1 function13 = new Function1() { // from class: o.oyZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37683oyU.EZpvd(function1, (OKConversation) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.oyY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C37683oyU.AYXKKw(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.ozc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37683oyU.AEQbTJ(function12, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.oza
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C37683oyU.valueOf(function14, obj);
                }
            });
        }
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, OKConversation oKConversation) {
        Intrinsics.copydefault(oKConversation);
        function1.invoke(oKConversation);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        function1.invoke(th);
        return Unit.INSTANCE;
    }

    public static final InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, @NotNull final Function1<? super GroupInfo, Unit> function1, @NotNull final Function1<? super java.lang.Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU == null) {
            throw new java.lang.IllegalArgumentException("OKIM Service not available".toString());
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C44525sTa.copydefault.EZpvd(new IMExtKt$loadGroupInfo$6(interfaceC35180nqU, str, null)));
        final Function1 function13 = new Function1() { // from class: o.ozh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37683oyU.OLrzqt(function1, function12, (GroupInfo) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ozf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C37683oyU.values(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.ozi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37683oyU.valueOf(function12, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ozl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C37683oyU.fetchVPNInfo(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, Function1 function12, GroupInfo groupInfo) {
        Intrinsics.copydefault(groupInfo);
        if (copydefault(groupInfo)) {
            function1.invoke(groupInfo);
        } else {
            function12.invoke(new OKIMGroupNotExistException(C33070mpX.AYXKKw(sDX.StateListAnimator.AhwBna)));
        }
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(Function1 function1, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        function1.invoke(th);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super java.util.List<GroupMemberInfo>, Unit> function1, @NotNull final Function1<? super java.lang.Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null) {
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(C33024moe.KWHzl(C44525sTa.copydefault.EZpvd(new IMExtKt$loadAllAdmins$1$1(interfaceC35180nqU, str, null))), lifecycleOwner);
            final Function1 function13 = new Function1() { // from class: o.oyT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37683oyU.copydefault(function1, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ozb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C37683oyU.AhwBna(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.ozd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37683oyU.KWHzl(function12, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ozg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C37683oyU.djBIcL(function14, obj);
                }
            });
        }
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, java.util.List list) {
        Intrinsics.copydefault(list);
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function1 function1, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        function1.invoke(th);
        return Unit.INSTANCE;
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "" : num != null ? pTB.formatRoundToFixed$default(C33129mqd.EZpvd(str), num.intValue(), null, 2, null) : str;
    }

    public static final android.net.Uri KWHzl(@NotNull OKGIFMessage oKGIFMessage) {
        Intrinsics.checkNotNullParameter(oKGIFMessage, "");
        android.net.Uri localUri = oKGIFMessage.getLocalUri();
        return localUri == null ? oKGIFMessage.getRemoteUri() : localUri;
    }

    public static final boolean AEQbTJ(@NotNull GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(groupInfo, "");
        C44457sQn c44457sQnEZpvd = EZpvd(groupInfo);
        return c44457sQnEZpvd.valueOf() || c44457sQnEZpvd.djBIcL() || c44457sQnEZpvd.AEQbTJ() || c44457sQnEZpvd.AhwBna() || c44457sQnEZpvd.DbNXlk() || c44457sQnEZpvd.EZpvd() || c44457sQnEZpvd.KWHzl() || c44457sQnEZpvd.AYXKKw() || c44457sQnEZpvd.OLrzqt();
    }

    public static final C44457sQn copydefault(@NotNull GroupRole groupRole) {
        Intrinsics.checkNotNullParameter(groupRole, "");
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU == null) {
            throw new java.lang.IllegalArgumentException("OKIM Service not available".toString());
        }
        return interfaceC35180nqU.AEQbTJ().copydefault().OLrzqt(groupRole);
    }

    public static final C44457sQn EZpvd(@NotNull GroupInfo groupInfo) {
        GroupRole role;
        Intrinsics.checkNotNullParameter(groupInfo, "");
        GroupUserSettingInfo userSettingInfo = groupInfo.getUserSettingInfo();
        if (userSettingInfo == null || (role = userSettingInfo.getRole()) == null) {
            role = GroupRole.Unknown;
        }
        return copydefault(role);
    }

    public static final boolean copydefault(@NotNull GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(groupInfo, "");
        return !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) groupInfo.getGroupId());
    }

    public static final java.lang.CharSequence KWHzl(OfficialTagInfo officialTagInfo) {
        if (officialTagInfo == null) {
            return null;
        }
        java.util.List<OfficialTagType> supportTagTypes = officialTagInfo.getSupportTagTypes();
        OTCService oTCService = (OTCService) C43251rlk.OLrzqt(OTCService.class);
        if (supportTagTypes.contains(OfficialTagType.DiamondMerchant)) {
            if (oTCService != null) {
                return oTCService.getDiamondMerchantLabelForIM();
            }
            return null;
        }
        if (!supportTagTypes.contains(OfficialTagType.CertifiedMerchant) || oTCService == null) {
            return null;
        }
        return oTCService.getVerifiedMerchantLabelForIM();
    }

    public static final OfficialTagInfo copydefault(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return oKConversation.getOfficialTagInfo();
    }

    public static final void AEQbTJ(@NotNull android.widget.TextView textView, @NotNull GroupRole groupRole) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(groupRole, "");
        int i = Application.OLrzqt[groupRole.ordinal()];
        if (i == 1) {
            textView.setVisibility(0);
            textView.setText(C35399nuc.LoaderManager.QMuEJi);
            textView.setBackgroundResource(C35399nuc.ActionBar.isConnected);
            textView.setTextAppearance(C52761wXj.LoaderManager.QUSxYX);
            return;
        }
        if (i == 2) {
            textView.setVisibility(0);
            textView.setText(C35399nuc.LoaderManager.idLUrz);
            textView.setBackgroundResource(C35399nuc.ActionBar.isConnected);
            textView.setTextAppearance(C52761wXj.LoaderManager.QUSxYX);
            return;
        }
        textView.setVisibility(8);
    }

    public static final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.codePointCount(0, str.length()) >= 20;
    }

    public static final android.text.SpannableString EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.text.SpannableString spannableString = new android.text.SpannableString(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default(str, "<li>", "", false, 4, (java.lang.Object) null), "</li>", "", false, 4, (java.lang.Object) null), "•", "", false, 4, (java.lang.Object) null)).toString());
        spannableString.setSpan(new android.text.style.BulletSpan(16), 0, spannableString.length(), 17);
        return spannableString;
    }
}
