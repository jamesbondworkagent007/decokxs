package o;

import android.provider.ContactsContract;
import androidx.camera.video.AudioStats;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.referral.biz.net.bean.AddressItem;
import io.reactivex.BackpressureStrategy;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33625mzw;
import o.C48824ucv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ubC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48726ubC {
    public static final C48726ubC KWHzl = new C48726ubC();
    public static java.util.ArrayList<AddressItem> EZpvd = new java.util.ArrayList<>();
    public static final int copydefault = 8;

    private C48726ubC() {
    }

    public static /* synthetic */ void getAddressList$default(C48726ubC c48726ubC, android.content.Context context, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        c48726ubC.EZpvd(context, (Function1<? super java.util.ArrayList<AddressItem>, Unit>) function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(final android.content.Context context, @NotNull final Function1<? super java.util.ArrayList<AddressItem>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (C33129mqd.KWHzl((java.util.Collection) EZpvd)) {
            function1.invoke(EZpvd);
            return;
        }
        if (context == 0 || !(context instanceof AbstractActivityC33041mov)) {
            return;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.ubI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C48726ubC.KWHzl(context, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXKWHzl2 = C58156yvv.EZpvd(abstractC58185ywXKWHzl, (LifecycleOwner) context).copydefault(yBP.OLrzqt()).KWHzl(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.ubN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48726ubC.KWHzl(function1, (java.util.ArrayList) obj);
            }
        };
        abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.ubL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C48726ubC.copydefault(function12, obj);
            }
        });
    }

    public static final void KWHzl(android.content.Context context, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        interfaceC58184ywW.onNext(KWHzl.copydefault(context));
        interfaceC58184ywW.onComplete();
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function1 function1, java.util.ArrayList arrayList) {
        EZpvd = arrayList;
        function1.invoke(arrayList);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void searchAddressFormKey$default(C48726ubC c48726ubC, android.content.Context context, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        c48726ubC.OLrzqt(context, str, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(android.content.Context context, @NotNull final java.lang.String str, @NotNull final Function1<? super java.util.ArrayList<AddressItem>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (EZpvd.isEmpty()) {
            function1.invoke(EZpvd);
            return;
        }
        if (context instanceof AbstractActivityC33041mov) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.ubG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    C48726ubC.EZpvd(str, interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            AbstractC58185ywX abstractC58185ywXKWHzl2 = C58156yvv.EZpvd(abstractC58185ywXKWHzl, (LifecycleOwner) context).copydefault(yBP.OLrzqt()).KWHzl(C58266yxz.OLrzqt());
            final Function1 function12 = new Function1() { // from class: o.ubF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C48726ubC.djBIcL(function1, (java.util.ArrayList) obj);
                }
            };
            abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.ubH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C48726ubC.djBIcL(function12, obj);
                }
            });
        }
    }

    public static final void EZpvd(java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        interfaceC58184ywW.onNext(KWHzl.KWHzl(str));
        interfaceC58184ywW.onComplete();
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(Function1 function1, java.util.ArrayList arrayList) {
        Intrinsics.copydefault(arrayList);
        function1.invoke(arrayList);
        return Unit.INSTANCE;
    }

    public final java.util.ArrayList<AddressItem> KWHzl(java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.ArrayList<AddressItem> arrayList2 = new java.util.ArrayList<>();
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
        if (string.length() == 0) {
            arrayList = EZpvd;
        } else {
            java.util.ArrayList<AddressItem> arrayList3 = EZpvd;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList3) {
                AddressItem addressItem = (AddressItem) obj;
                java.lang.String name = addressItem.getName();
                java.util.Locale locale = java.util.Locale.ROOT;
                java.lang.String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                java.lang.String lowerCase2 = string.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                boolean zContains$default = StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) lowerCase2, false, 2, (java.lang.Object) null);
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) addressItem.getNum(), (java.lang.CharSequence) string, false, 2, (java.lang.Object) null)) {
                    zContains$default = true;
                }
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) addressItem.getSearchNum(), (java.lang.CharSequence) string, false, 2, (java.lang.Object) null) || zContains$default) {
                    arrayList4.add(obj);
                }
            }
            arrayList = arrayList4;
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public static /* synthetic */ void fuzzySearchAddressFormKey$default(C48726ubC c48726ubC, android.content.Context context, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        c48726ubC.KWHzl(context, str, (Function1<? super java.util.ArrayList<AddressItem>, Unit>) function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(android.content.Context context, @NotNull final java.lang.String str, @NotNull final Function1<? super java.util.ArrayList<AddressItem>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (EZpvd.isEmpty()) {
            function1.invoke(EZpvd);
            return;
        }
        if (context instanceof AbstractActivityC33041mov) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.ubO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    C48726ubC.OLrzqt(str, interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            AbstractC58185ywX abstractC58185ywXKWHzl2 = C58156yvv.EZpvd(abstractC58185ywXKWHzl, (LifecycleOwner) context).copydefault(yBP.OLrzqt()).KWHzl(C58266yxz.OLrzqt());
            final Function1 function12 = new Function1() { // from class: o.ubM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C48726ubC.EZpvd(function1, (java.util.ArrayList) obj);
                }
            };
            abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.ubJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C48726ubC.EZpvd(function12, obj);
                }
            });
        }
    }

    public static final void OLrzqt(java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        interfaceC58184ywW.onNext(KWHzl.OLrzqt(str));
        interfaceC58184ywW.onComplete();
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, java.util.ArrayList arrayList) {
        Intrinsics.copydefault(arrayList);
        function1.invoke(arrayList);
        return Unit.INSTANCE;
    }

    public final java.util.ArrayList<AddressItem> OLrzqt(java.lang.String str) {
        java.util.ArrayList<AddressItem> arrayList = new java.util.ArrayList<>();
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
        if (string.length() == 0) {
            return EZpvd;
        }
        java.util.List listCopydefault = C47222tlv.KWHzl.copydefault(string, EZpvd, FuzzySearchEventSourceEnum.OKGROWTH.getSource(), false);
        arrayList.clear();
        arrayList.addAll(listCopydefault);
        return arrayList;
    }

    public final java.util.ArrayList<AddressItem> copydefault(android.content.Context context) throws java.lang.Throwable {
        java.util.ArrayList<AddressItem> arrayList = new java.util.ArrayList<>();
        java.util.HashMap<java.lang.Integer, java.lang.Integer> map = new java.util.HashMap<>();
        try {
            KWHzl(context, map, arrayList);
        } catch (java.lang.Exception e) {
            C6777aVl.Companion.EZpvd(new java.lang.Exception(e.getLocalizedMessage(), e));
        }
        map.clear();
        return arrayList;
    }

    public final void KWHzl(android.content.Context context, java.util.HashMap<java.lang.Integer, java.lang.Integer> map, java.util.ArrayList<AddressItem> arrayList) throws java.lang.Throwable {
        java.lang.String str;
        C48726ubC c48726ubC;
        android.database.Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new java.lang.String[]{"contact_id", "display_name", "data1"}, null, null, "display_name COLLATE LOCALIZED ASC");
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th) {
            th = th;
        }
        if (cursorQuery == null) {
            if (cursorQuery != null) {
                cursorQuery.close();
                return;
            }
            return;
        }
        int i = 0;
        while (cursorQuery.moveToNext()) {
            int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("contact_id"));
            java.lang.String string = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
            java.lang.String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("data1"));
            android.net.Uri uriWithAppendedId = android.content.ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, C33129mqd.valueOf(java.lang.Integer.valueOf(i2)));
            Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "");
            if (string2 != null && string2.length() != 0 && map.get(java.lang.Integer.valueOf(i2)) == null) {
                if (string == null) {
                    c48726ubC = this;
                    str = "";
                } else {
                    str = string;
                    c48726ubC = this;
                }
                try {
                    arrayList.add(new AddressItem(i, str, string2, c48726ubC.EZpvd(string2), C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2)), 0, C33129mqd.gEmmrt(uriWithAppendedId), (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 1920, (DefaultConstructorMarker) null));
                    i++;
                    map.put(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(arrayList.size() - 1));
                } catch (java.lang.Exception unused2) {
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
        }
        cursorQuery.close();
        if (cursorQuery == null) {
            return;
        }
        cursorQuery.close();
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) " ", false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) ? C59449zhJ.replace$default(C59449zhJ.replace$default(str, " ", "", false, 4, (java.lang.Object) null), "-", "", false, 4, (java.lang.Object) null) : str;
    }

    public static /* synthetic */ void requestAddressPermission$default(C48726ubC c48726ubC, android.content.Context context, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        c48726ubC.AEQbTJ(context, (Function1<? super java.lang.Integer, Unit>) function1);
    }

    public final void AEQbTJ(android.content.Context context, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (context != null) {
            AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
            if (abstractActivityC33041mov == null) {
                return;
            }
            C60121zwJ.AEQbTJ(abstractActivityC33041mov, C33070mpX.AYXKKw(C48824ucv.Application.copydefault), 7, "android.permission.READ_CONTACTS");
            abstractActivityC33041mov.getPermissionHelper().AhwBna = new Application(function1, abstractActivityC33041mov);
        }
    }

    /* JADX INFO: renamed from: o.ubC$Application */
    public static final class Application implements C33625mzw.Activity {
        public final /* synthetic */ Function1<java.lang.Integer, Unit> AEQbTJ;
        public final /* synthetic */ AbstractActivityC33041mov OLrzqt;

        @Override // o.C33625mzw.Activity
        public void EZpvd(java.util.List<java.lang.String> list) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function1<? super java.lang.Integer, Unit> function1, AbstractActivityC33041mov abstractActivityC33041mov) {
            this.AEQbTJ = function1;
            this.OLrzqt = abstractActivityC33041mov;
        }

        @Override // o.C33625mzw.Activity
        public void EZpvd() {
            this.AEQbTJ.invoke(1);
        }

        @Override // o.C33625mzw.Activity
        public void OLrzqt(int i, java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (ActivityCompat.shouldShowRequestPermissionRationale(this.OLrzqt, "android.permission.READ_CONTACTS")) {
                this.AEQbTJ.invoke(3);
            } else {
                this.AEQbTJ.invoke(0);
            }
        }
    }

    public static /* synthetic */ void checkAddressPermission$default(C48726ubC c48726ubC, android.content.Context context, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        c48726ubC.OLrzqt(context, (Function1<? super java.lang.Integer, Unit>) function1);
    }

    public final void OLrzqt(android.content.Context context, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (context != null) {
            AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
            if (abstractActivityC33041mov == null) {
                return;
            }
            function1.invoke(java.lang.Integer.valueOf(C60121zwJ.KWHzl(abstractActivityC33041mov, "android.permission.READ_CONTACTS") ? 1 : 0));
        }
    }

    public static /* synthetic */ void jumpSettingPage$default(C48726ubC c48726ubC, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        c48726ubC.EZpvd(context);
    }

    public final void EZpvd(android.content.Context context) {
        if (context != null) {
            AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
            if (abstractActivityC33041mov == null) {
                return;
            }
            abstractActivityC33041mov.getPermissionHelper().KWHzl(abstractActivityC33041mov);
        }
    }

    public final void AEQbTJ(android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (context != null) {
            try {
                AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
                if (abstractActivityC33041mov == null) {
                    return;
                }
                android.net.Uri uri = android.net.Uri.parse("smsto:" + str);
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("android.intent.action.SENDTO");
                intent.setData(uri);
                intent.putExtra("sms_body", str2);
                abstractActivityC33041mov.startActivity(intent);
                KWHzl.AEQbTJ(str3);
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("identifier", str3);
                linkedHashMap.put("state", 1);
                abstractActivityC33041mov.postDelay(new java.lang.Runnable() { // from class: o.ubA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C48726ubC.OLrzqt(linkedHashMap);
                    }
                }, 300L);
            } catch (java.lang.Exception unused) {
                C55326xho.toastWithFailedIcon$default(C48824ucv.Application.KWHzl, 0, 1, (java.lang.Object) null);
            }
        }
    }

    public static final void OLrzqt(java.util.Map map) {
        C7323ahf.KWHzl().AEQbTJ("OKReferralSendSmsEvent", null, map);
    }

    public final void EZpvd(android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (context != null) {
            try {
                AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
                if (abstractActivityC33041mov == null) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
                intent.setData(android.net.Uri.parse(C33070mpX.AYXKKw(C48824ucv.Application.AEQbTJ) + str));
                intent.putExtra("android.intent.extra.SUBJECT", str2);
                intent.putExtra("android.intent.extra.TEXT", str3);
                abstractActivityC33041mov.startActivity(intent);
                KWHzl.AEQbTJ(str4);
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("identifier", str4);
                linkedHashMap.put("state", 1);
                abstractActivityC33041mov.postDelay(new java.lang.Runnable() { // from class: o.ubE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C48726ubC.EZpvd(linkedHashMap);
                    }
                }, 300L);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static final void EZpvd(java.util.Map map) {
        C7323ahf.KWHzl().AEQbTJ("OKReferralSendEmailEvent", null, map);
    }

    public final void AEQbTJ(java.lang.String str) {
        if (C33129mqd.KWHzl((java.util.Collection) EZpvd)) {
            java.util.Iterator<AddressItem> it = EZpvd.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                AddressItem next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                AddressItem addressItem = next;
                if (Intrinsics.EZpvd((java.lang.Object) addressItem.getIdentifier(), (java.lang.Object) str)) {
                    addressItem.setState(1);
                    return;
                }
            }
        }
    }
}
