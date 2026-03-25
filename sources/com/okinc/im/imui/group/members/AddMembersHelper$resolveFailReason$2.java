package com.okinc.im.imui.group.members;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.okinc.okimcore.model.im.GroupActionFailReason;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C33069mpW;
import o.C33070mpX;
import o.C35399nuc;
import o.C37683oyU;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C59454zhO;
import o.nWM;
import o.oDU;
import o.pTB;

/* JADX INFO: loaded from: classes18.dex */
public final class AddMembersHelper$resolveFailReason$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SpannableString>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ GroupAddMembersResult $result;
    int label;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupActionFailReason.values().length];
            try {
                iArr[GroupActionFailReason.ExceededGroupSize.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupActionFailReason.AutoGroupAdditionDisallowed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupActionFailReason.InGroupBlockList.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupActionFailReason.NonCompliantUsers.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GroupActionFailReason.UsersInfoMissing.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GroupActionFailReason.UsersAlreadyInGroup.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GroupActionFailReason.UsersAreStrangerOrNotContact.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GroupActionFailReason.AdminApprovalRequired.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GroupActionFailReason.SentInvitationInstead.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMembersHelper$resolveFailReason$2(String str, GroupAddMembersResult groupAddMembersResult, Continuation<? super AddMembersHelper$resolveFailReason$2> continuation) {
        super(2, continuation);
        this.$groupId = str;
        this.$result = groupAddMembersResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddMembersHelper$resolveFailReason$2(this.$groupId, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SpannableString> continuation) {
        return ((AddMembersHelper$resolveFailReason$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oDU oduKWHzl = nWM.EZpvd.KWHzl();
            String str = this.$groupId;
            this.label = 1;
            obj = oduKWHzl.AEQbTJ(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        String localized$default = pTB.formatLocalized$default(String.valueOf(((Number) obj).intValue()), null, 1, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        GroupAddMembersResult groupAddMembersResult = this.$result;
        if (groupAddMembersResult.getFailedReasons().containsKey(GroupActionFailReason.GroupEntryVerificationsRequired)) {
            spannableStringBuilder.append((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.gVEiQJ));
        } else if (groupAddMembersResult.getFailedReasons().containsKey(GroupActionFailReason.Unknown)) {
            spannableStringBuilder.append((CharSequence) C33070mpX.EZpvd(C35399nuc.Fragment.KWHzl, groupAddMembersResult.getTotalInvitees()));
        } else if (groupAddMembersResult.getFailedReasons().size() > 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(groupAddMembersResult.getFailedReasons());
            GroupActionFailReason groupActionFailReason = GroupActionFailReason.SentInvitationInstead;
            List list = (List) linkedHashMap.remove(groupActionFailReason);
            if (list != null) {
                linkedHashMap.put(groupActionFailReason, list);
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                GroupActionFailReason groupActionFailReason2 = (GroupActionFailReason) ((Map.Entry) it.next()).getKey();
                switch (groupActionFailReason2 == null ? -1 : ActionBar.copydefault[groupActionFailReason2.ordinal()]) {
                    case 1:
                        spannableStringBuilder.append((CharSequence) C37683oyU.EZpvd(C33069mpW.copydefault(C35399nuc.LoaderManager.RsCxkX, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", localized$default))))).append('\n');
                        break;
                    case 2:
                        spannableStringBuilder.append((CharSequence) nWM.EZpvd.AEQbTJ(C35399nuc.LoaderManager.HJWChP)).append('\n');
                        break;
                    case 3:
                        spannableStringBuilder.append((CharSequence) nWM.EZpvd.AEQbTJ(C35399nuc.LoaderManager.fXG)).append('\n');
                        break;
                    case 4:
                        spannableStringBuilder.append((CharSequence) nWM.EZpvd.AEQbTJ(C35399nuc.LoaderManager.onReceive)).append('\n');
                        break;
                    case 5:
                        spannableStringBuilder.append((CharSequence) nWM.EZpvd.AEQbTJ(C35399nuc.LoaderManager.createSocket)).append('\n');
                        break;
                    case 6:
                        spannableStringBuilder.append((CharSequence) nWM.EZpvd.AEQbTJ(C35399nuc.LoaderManager.STbtMW)).append('\n');
                        break;
                    case 7:
                        spannableStringBuilder.append((CharSequence) nWM.EZpvd.AEQbTJ(C35399nuc.LoaderManager.DGGHxk)).append('\n');
                        break;
                    case 8:
                        spannableStringBuilder.append((CharSequence) nWM.EZpvd.AEQbTJ(C35399nuc.LoaderManager.OAhWiU)).append('\n');
                        break;
                    case 9:
                        if (!StringsKt__StringsKt.fARcdN(spannableStringBuilder)) {
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) C33070mpX.EZpvd(C35399nuc.Fragment.getNewProxyInstance, groupAddMembersResult.getTotalInvitees())).append('\n');
                        break;
                    default:
                        Unit unit = Unit.INSTANCE;
                        break;
                }
            }
        } else {
            Iterator<Map.Entry<GroupActionFailReason, List<String>>> it2 = groupAddMembersResult.getFailedReasons().entrySet().iterator();
            while (it2.hasNext()) {
                switch (ActionBar.copydefault[it2.next().getKey().ordinal()]) {
                    case 1:
                        spannableStringBuilder.append((CharSequence) C33069mpW.copydefault(C35399nuc.LoaderManager.RjCdvp, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", localized$default))));
                        break;
                    case 2:
                        spannableStringBuilder.append((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.HJWChPDXdlte));
                        break;
                    case 3:
                        spannableStringBuilder.append((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.IIEbr));
                        break;
                    case 4:
                        spannableStringBuilder.append((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.fHqPtx));
                        break;
                    case 5:
                        spannableStringBuilder.append((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.zqaRxl));
                        break;
                    case 6:
                        spannableStringBuilder.append((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.hkDICb));
                        break;
                    case 7:
                        spannableStringBuilder.append((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.ExKek));
                        break;
                    case 8:
                        spannableStringBuilder.append((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.HJWChPOZOJIj));
                        break;
                    case 9:
                        spannableStringBuilder.append((CharSequence) C33070mpX.EZpvd(C35399nuc.Fragment.getNewProxyInstance, groupAddMembersResult.getTotalInvitees()));
                        break;
                    default:
                        Unit unit2 = Unit.INSTANCE;
                        break;
                }
            }
        }
        while (true) {
            Character chGHZMYf = C59454zhO.gHZMYf(spannableStringBuilder);
            if (chGHZMYf != null && CharsKt__CharJVMKt.EZpvd(chGHZMYf.charValue())) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
        }
        return new SpannableString(spannableStringBuilder);
    }
}
