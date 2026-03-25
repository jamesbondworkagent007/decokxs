package o;

import android.content.DialogInterface;
import android.view.View;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.business.defi.dapp.utils.DappDeeplinkRegexBean;
import com.okinc.business.defi.dapp.utils.DappDeeplinkUtils$getRegexJson$1;
import com.okinc.business.defi.dapp.utils.DappHistoryBlack;
import com.okinc.business.defi.dapp.utils.DappHistoryRegex;
import com.okinc.business.defi.dapp.utils.KeyValueBean;
import com.okinc.core.util.SPUtils;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.InterfaceC43294rma;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dyj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15142dyj {
    public static boolean AEQbTJ;
    public static final C15142dyj EZpvd = new C15142dyj();
    public static volatile CopyOnWriteArrayList<DappDeeplinkRegexBean> copydefault = new CopyOnWriteArrayList<>();
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void AEQbTJ(android.content.DialogInterface dialogInterface) {
        AEQbTJ = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull CopyOnWriteArrayList<DappDeeplinkRegexBean> copyOnWriteArrayList) {
        Intrinsics.checkNotNullParameter(copyOnWriteArrayList, "");
        copydefault = copyOnWriteArrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyOnWriteArrayList<DappDeeplinkRegexBean> KWHzl() {
        return copydefault;
    }

    private C15142dyj() {
    }

    public final java.lang.String djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(str, (Function1<? super java.lang.String, Unit>) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dyj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.String regexDeeplink$default(C15142dyj c15142dyj, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return c15142dyj.OLrzqt(str, (Function1<? super java.lang.String, Unit>) function1);
    }

    public final java.lang.String OLrzqt(@NotNull final java.lang.String str, final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (C14923duc.EZpvd.valueOf(str) && EZpvd()) {
                if (copydefault.isEmpty()) {
                    KWHzl(new Function0() { // from class: o.dyq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C15142dyj.OLrzqt(function1, str);
                        }
                    });
                    return "";
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.HashMap map = new java.util.HashMap();
                for (DappDeeplinkRegexBean dappDeeplinkRegexBean : copydefault) {
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) dappDeeplinkRegexBean.getMinVersion()) || !EZpvd.KWHzl(dappDeeplinkRegexBean.getMinVersion())) {
                        Matcher matcher = Pattern.compile(dappDeeplinkRegexBean.getRegex()).matcher(str);
                        Intrinsics.checkNotNullExpressionValue(matcher, "");
                        if (!matcher.find()) {
                            continue;
                        } else if (matcher.groupCount() > 0) {
                            int iGroupCount = matcher.groupCount();
                            if (1 <= iGroupCount) {
                                int i = 1;
                                while (true) {
                                    java.lang.String strGroup = matcher.group(i);
                                    if (strGroup == null) {
                                        strGroup = "";
                                    }
                                    arrayList.add(strGroup);
                                    if (i == iGroupCount) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                int i2 = 0;
                                for (java.lang.Object obj : dappDeeplinkRegexBean.getRegexMatchs()) {
                                    if (i2 < 0) {
                                        yDY.AYXKKw();
                                    }
                                    KeyValueBean keyValueBean = (KeyValueBean) obj;
                                    java.lang.String key = keyValueBean.getKey();
                                    java.lang.String str2 = keyValueBean.getValueMap().get(arrayList.get(i2));
                                    if (str2 == null) {
                                        java.lang.Object obj2 = arrayList.get(i2);
                                        Intrinsics.checkNotNullExpressionValue(obj2, "");
                                        str2 = (java.lang.String) obj2;
                                    }
                                    map.put(key, str2);
                                    i2++;
                                }
                            }
                            android.net.Uri uri = android.net.Uri.parse(str);
                            java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
                            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
                            for (java.lang.String str3 : queryParameterNames) {
                                java.lang.String queryParameter = uri.getQueryParameter(str3);
                                if (queryParameter == null) {
                                    queryParameter = "";
                                }
                                map.put(str3, queryParameter);
                            }
                            Pattern patternCompile = Pattern.compile("([^&#=]+)=([^&#=]*)");
                            java.lang.String strGroup2 = matcher.group(1);
                            if (strGroup2 == null) {
                                strGroup2 = "";
                            }
                            Matcher matcher2 = patternCompile.matcher(strGroup2);
                            while (matcher2.find()) {
                                if (matcher2.groupCount() == 2) {
                                    java.lang.String strGroup3 = matcher2.group(1);
                                    if (strGroup3 == null) {
                                        strGroup3 = "";
                                    }
                                    java.lang.String strGroup4 = matcher2.group(2);
                                    if (strGroup4 == null) {
                                        strGroup4 = "";
                                    }
                                    map.put(strGroup3, strGroup4);
                                }
                            }
                            if (!map.isEmpty()) {
                                android.net.Uri uri2 = android.net.Uri.parse(dappDeeplinkRegexBean.getDeeplink());
                                java.lang.String deeplink = dappDeeplinkRegexBean.getDeeplink();
                                java.util.Set<java.lang.String> queryParameterNames2 = uri2.getQueryParameterNames();
                                Intrinsics.checkNotNullExpressionValue(queryParameterNames2, "");
                                java.lang.String strReplace$default = deeplink;
                                for (java.lang.String str4 : queryParameterNames2) {
                                    java.lang.String str5 = (java.lang.String) map.get(dappDeeplinkRegexBean.getParamsMap().get(str4));
                                    if (str5 != null) {
                                        strReplace$default = C59449zhJ.replace$default(strReplace$default, str4 + ContainerUtils.KEY_VALUE_DELIMITER, str4 + ContainerUtils.KEY_VALUE_DELIMITER + str5, false, 4, (java.lang.Object) null);
                                    }
                                }
                                if (C14867dtZ.AEQbTJ.EZpvd(dappDeeplinkRegexBean.getDeeplink())) {
                                    if (function1 != null) {
                                        function1.invoke(strReplace$default);
                                    }
                                    return strReplace$default;
                                }
                                if (function1 != null) {
                                    function1.invoke("");
                                }
                                return "";
                            }
                        } else {
                            if (C14867dtZ.AEQbTJ.EZpvd(dappDeeplinkRegexBean.getDeeplink())) {
                                if (function1 != null) {
                                    function1.invoke(dappDeeplinkRegexBean.getDeeplink());
                                }
                                return dappDeeplinkRegexBean.getDeeplink();
                            }
                            if (function1 != null) {
                                function1.invoke("");
                            }
                            return "";
                        }
                    }
                }
                if (function1 != null) {
                    function1.invoke("");
                }
                return "";
            }
            if (function1 != null) {
                function1.invoke("");
            }
            return "";
        } catch (java.lang.Exception unused) {
            if (function1 != null) {
                function1.invoke("");
            }
            return "";
        }
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.String str) {
        if (C33129mqd.KWHzl((java.util.Collection) copydefault)) {
            if (function1 != null) {
                function1.invoke(EZpvd.djBIcL(str));
            }
        } else if (function1 != null) {
            function1.invoke("");
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final android.app.Activity activity, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (AEQbTJ) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaYEZpvd = C14923duc.EZpvd.EZpvd(activity);
        viewOnClickListenerC54939xaYEZpvd.copydefault(dLX.Dialog.zuBGHE);
        viewOnClickListenerC54939xaYEZpvd.EZpvd(dLX.Dialog.zLjUOn, new View.OnClickListener() { // from class: o.dyn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15142dyj.copydefault(viewOnClickListenerC54939xaYEZpvd, activity, str, view);
            }
        });
        viewOnClickListenerC54939xaYEZpvd.OLrzqt(dLX.Dialog.dUDNAs, new View.OnClickListener() { // from class: o.dyo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15142dyj.OLrzqt(viewOnClickListenerC54939xaYEZpvd, view);
            }
        });
        viewOnClickListenerC54939xaYEZpvd.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.dyk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C15142dyj.AEQbTJ(dialogInterface);
            }
        });
        viewOnClickListenerC54939xaYEZpvd.setCancelable(true);
        viewOnClickListenerC54939xaYEZpvd.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaYEZpvd.show();
        AEQbTJ = true;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.app.Activity activity, java.lang.String str, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, str, null, new Function1() { // from class: o.dym
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15142dyj.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final boolean EZpvd() {
        return C48787ucK.AEQbTJ.AEQbTJ("dappConfig.regexMatch", 1) == 1;
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(C14867dtZ.AEQbTJ.AEQbTJ(), str);
    }

    public final boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str) || !C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            return false;
        }
        java.util.List<java.lang.String> listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        java.util.List<java.lang.String> listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() == 3 && listSplit$default2.size() == 3) {
            return copydefault(listSplit$default, listSplit$default2);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dyj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getRegexJson$default(C15142dyj c15142dyj, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c15142dyj.KWHzl((Function0<Unit>) function0);
    }

    public final void KWHzl(Function0<Unit> function0) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new DappDeeplinkUtils$getRegexJson$1("file_discover_regex", function0, null), 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dyj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getUA$default(C15142dyj c15142dyj, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c15142dyj.KWHzl(str, (Function1<? super java.lang.String, Unit>) function1);
    }

    public final void KWHzl(final java.lang.String str, final Function1<? super java.lang.String, Unit> function1) {
        if (copydefault.isEmpty()) {
            KWHzl(new Function0() { // from class: o.dyl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C15142dyj.KWHzl(function1, str);
                }
            });
        } else if (function1 != null) {
            function1.invoke(copydefault(str));
        }
    }

    public static final Unit KWHzl(Function1 function1, java.lang.String str) {
        if (C33129mqd.KWHzl((java.util.Collection) copydefault)) {
            if (function1 != null) {
                function1.invoke(EZpvd.copydefault(str));
            }
        } else if (function1 != null) {
            function1.invoke("");
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(java.lang.String str) {
        java.lang.String strKWHzl;
        try {
            strKWHzl = C14923duc.EZpvd.KWHzl(str == null ? "" : str);
        } catch (java.lang.Exception unused) {
        }
        for (DappDeeplinkRegexBean dappDeeplinkRegexBean : copydefault) {
            java.util.Map<java.lang.String, java.lang.Integer> uaConfig = dappDeeplinkRegexBean.getUaConfig();
            if (uaConfig != null) {
                for (Map.Entry<java.lang.String, java.lang.Integer> entry : uaConfig.entrySet()) {
                    if ((StringsKt__StringsKt.contains$default((java.lang.CharSequence) entry.getKey(), (java.lang.CharSequence) "/", false, 2, (java.lang.Object) null) ? Intrinsics.EZpvd(StringsKt__StringsKt.split$default((java.lang.CharSequence) entry.getKey(), new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null).get(0), (java.lang.Object) strKWHzl) : Intrinsics.EZpvd((java.lang.Object) entry.getKey(), (java.lang.Object) strKWHzl)) && str != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) entry.getKey(), false, 2, (java.lang.Object) null) && (entry.getValue().intValue() & 1) == 1) {
                        return dappDeeplinkRegexBean.getUaString();
                    }
                    return "";
                }
            }
        }
        return "";
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> OLrzqt(@NotNull java.lang.String str) {
        int iIndexOf$default;
        java.util.List listAhwBna;
        java.util.List listAhwBna2;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        if (android.text.TextUtils.isEmpty(str) || (iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, "?", 0, false, 6, (java.lang.Object) null)) < 0) {
            return map;
        }
        java.lang.String strSubstring = str.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.util.List<java.lang.String> listSplit = new Regex(ContainerUtils.FIELD_DELIMITER).split(strSubstring, 0);
        if (!listSplit.isEmpty()) {
            java.util.ListIterator<java.lang.String> listIterator = listSplit.listIterator(listSplit.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = yDY.AhwBna();
        }
        for (java.lang.String str2 : (java.lang.String[]) listAhwBna.toArray(new java.lang.String[0])) {
            java.util.List<java.lang.String> listSplit2 = new Regex(ContainerUtils.KEY_VALUE_DELIMITER).split(str2, 0);
            if (!listSplit2.isEmpty()) {
                java.util.ListIterator<java.lang.String> listIterator2 = listSplit2.listIterator(listSplit2.size());
                while (listIterator2.hasPrevious()) {
                    if (listIterator2.previous().length() != 0) {
                        listAhwBna2 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listSplit2, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
                listAhwBna2 = yDY.AhwBna();
            } else {
                listAhwBna2 = yDY.AhwBna();
            }
            java.lang.String[] strArr = (java.lang.String[]) listAhwBna2.toArray(new java.lang.String[0]);
            if (strArr.length == 2) {
                map.put(strArr[0], strArr[1]);
            }
        }
        return map;
    }

    public final boolean gEmmrt(java.lang.String str) {
        C14923duc c14923duc = C14923duc.EZpvd;
        if (str == null) {
            str = "";
        }
        java.lang.String strKWHzl = c14923duc.KWHzl(str);
        if (strKWHzl != null && strKWHzl.length() != 0) {
            CopyOnWriteArrayList<DappDeeplinkRegexBean> copyOnWriteArrayList = copydefault;
            if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
                java.util.Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    java.util.List<java.lang.String> defaultUaConfig = ((DappDeeplinkRegexBean) it.next()).getDefaultUaConfig();
                    if (defaultUaConfig != null && defaultUaConfig.contains(strKWHzl)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean AEQbTJ(java.lang.String str) {
        C14923duc c14923duc = C14923duc.EZpvd;
        if (str == null) {
            str = "";
        }
        java.lang.String strKWHzl = c14923duc.KWHzl(str);
        if (strKWHzl != null && strKWHzl.length() != 0) {
            CopyOnWriteArrayList<DappDeeplinkRegexBean> copyOnWriteArrayList = copydefault;
            if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
                java.util.Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    java.util.List<java.lang.String> noDohUrlConfig = ((DappDeeplinkRegexBean) it.next()).getNoDohUrlConfig();
                    if (noDohUrlConfig != null && noDohUrlConfig.contains(strKWHzl)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void KWHzl(@NotNull final java.util.List<java.lang.String> list, @NotNull final Function1<? super java.util.List<java.lang.String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (list.isEmpty()) {
            function1.invoke(yDY.AhwBna());
        } else if (copydefault.isEmpty()) {
            KWHzl(new Function0() { // from class: o.dyg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C15142dyj.EZpvd(list, function1);
                }
            });
        } else {
            OLrzqt(list, function1);
        }
    }

    public static final Unit EZpvd(java.util.List list, Function1 function1) {
        EZpvd.OLrzqt((java.util.List<java.lang.String>) list, (Function1<? super java.util.List<java.lang.String>, Unit>) function1);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.util.List<java.lang.String> list, Function1<? super java.util.List<java.lang.String>, Unit> function1) {
        java.lang.Integer numValueOf;
        java.lang.Object objM7377constructorimpl;
        java.util.Collection collectionAhwBna;
        java.util.List<DappHistoryRegex> regexList;
        java.lang.Object objM7377constructorimpl2;
        java.util.Iterator<T> it = copydefault.iterator();
        while (true) {
            if (!it.hasNext()) {
                numValueOf = null;
                break;
            }
            DappHistoryBlack dappHistoryBlackList = ((DappDeeplinkRegexBean) it.next()).getDappHistoryBlackList();
            numValueOf = dappHistoryBlackList != null ? java.lang.Integer.valueOf(dappHistoryBlackList.getVersion()) : null;
            if (numValueOf != null) {
                break;
            }
        }
        if (numValueOf == null) {
            function1.invoke(yDY.AhwBna());
            return;
        }
        if (Intrinsics.EZpvd(numValueOf, SPUtils.getInt("key_dapp_history_blacklist_version", -1))) {
            function1.invoke(yDY.AhwBna());
            return;
        }
        CopyOnWriteArrayList<DappDeeplinkRegexBean> copyOnWriteArrayList = copydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            DappHistoryBlack dappHistoryBlackList2 = ((DappDeeplinkRegexBean) it2.next()).getDappHistoryBlackList();
            if (dappHistoryBlackList2 == null || (regexList = dappHistoryBlackList2.getRegexList()) == null) {
                collectionAhwBna = yDY.AhwBna();
            } else {
                collectionAhwBna = new java.util.ArrayList();
                for (DappHistoryRegex dappHistoryRegex : regexList) {
                    try {
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(new Regex(dappHistoryRegex.getRegex()));
                    } catch (java.lang.Throwable th) {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                        objM7377constructorimpl2 = null;
                    }
                    Regex regex = (Regex) objM7377constructorimpl2;
                    if (regex != null) {
                        collectionAhwBna.add(regex);
                    }
                }
            }
            C56406yEe.KWHzl(arrayList, collectionAhwBna);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.String str = (java.lang.String) obj;
            if (!arrayList.isEmpty()) {
                java.util.Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Regex regex2 = (Regex) it3.next();
                        try {
                            Result.Application application3 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(regex2.containsMatchIn(str)));
                        } catch (java.lang.Throwable th2) {
                            Result.Application application4 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                        }
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                            objM7377constructorimpl = bool;
                        }
                        if (((java.lang.Boolean) objM7377constructorimpl).booleanValue()) {
                            arrayList2.add(obj);
                            break;
                        }
                    }
                }
            }
        }
        SPUtils.put("key_dapp_history_blacklist_version", numValueOf);
        function1.invoke(arrayList2);
    }

    public final boolean copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) list2.get(i))) {
                return C33129mqd.valueOf(str) < C33129mqd.valueOf(list2.get(i));
            }
            i++;
        }
        return false;
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        CopyOnWriteArrayList<DappDeeplinkRegexBean> copyOnWriteArrayList = copydefault;
        if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
            java.util.Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                java.util.List<java.lang.String> jsBridgeMethodBlackList = ((DappDeeplinkRegexBean) it.next()).getJsBridgeMethodBlackList();
                if (jsBridgeMethodBlackList != null && jsBridgeMethodBlackList.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
