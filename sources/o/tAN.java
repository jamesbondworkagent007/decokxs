package o;

import android.os.Build;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.planet.biz_performance.ProfileOverviewFragment$observeUserDataChanges$1;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.biz_userprofile.data.PlanetUid;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC46114tIi;
import o.C46388tSm;
import o.C47501trL;
import o.InterfaceC47502trM;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tAN extends AbstractC32996moC implements InterfaceC47502trM<C46272tOe> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public boolean KWHzl;
    public C46272tOe copydefault;
    public final InterfaceC56387yDm values;
    public final int AYXKKw = C47501trL.Application.OHqIaq;
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new TaskDescription(this, PlanetUniqueName.Key, PlanetUniqueName.EZpvd(PlanetUniqueName.Companion.AEQbTJ())));
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new ActionBar(this, PlanetAuthorId.Key, PlanetAuthorId.OLrzqt(PlanetAuthorId.Companion.OLrzqt())));
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Activity(this, PlanetUid.Key, PlanetUid.KWHzl(PlanetUid.Companion.copydefault())));
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Fragment(this, AppsFlyerProperties.CHANNEL, ""));
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Dialog(this, "page", ""));
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new PendingIntent(this, "timePeriod", ""));
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new LoaderManager(this, "community_user_center_user_location", ""));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C46272tOe OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(C46272tOe c46272tOe) {
        this.copydefault = c46272tOe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    public static final class ActionBar implements Function0<PlanetAuthorId> {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;
        public final /* synthetic */ java.lang.Object OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.KWHzl = fragment;
            this.EZpvd = str;
            this.OLrzqt = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.okinc.planet.biz_userprofile.data.PlanetAuthorId */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.okinc.planet.biz_userprofile.data.PlanetAuthorId, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final PlanetAuthorId invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle arguments = this.KWHzl.getArguments();
            java.lang.String str = this.EZpvd;
            ?? r2 = this.OLrzqt;
            if (arguments == null || !arguments.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(PlanetAuthorId.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(arguments.getInt(str));
                    obj = (PlanetAuthorId) (objValueOf instanceof PlanetAuthorId ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(arguments.getLong(str));
                    obj = (PlanetAuthorId) (objValueOf2 instanceof PlanetAuthorId ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(arguments.getFloat(str));
                    obj = (PlanetAuthorId) (objValueOf3 instanceof PlanetAuthorId ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(arguments.getDouble(str));
                    obj = (PlanetAuthorId) (objValueOf4 instanceof PlanetAuthorId ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(arguments.getBoolean(str));
                    obj = (PlanetAuthorId) (objValueOf5 instanceof PlanetAuthorId ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    java.lang.Object string = arguments.getString(str);
                    obj = (PlanetAuthorId) (string instanceof PlanetAuthorId ? string : null);
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable(str, PlanetAuthorId.class);
                } else {
                    java.lang.Object parcelable2 = arguments.getParcelable(str);
                    obj = (PlanetAuthorId) (parcelable2 instanceof PlanetAuthorId ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = arguments.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.okinc.planet.biz_userprofile.data.PlanetAuthorId");
                }
                parcelable = (PlanetAuthorId) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = arguments.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.okinc.planet.biz_userprofile.data.PlanetAuthorId");
                }
                parcelable = (PlanetAuthorId) parcelableArrayList2;
            }
            obj = parcelable;
            if (obj != null) {
            }
        }
    }

    public static final class Activity implements Function0<PlanetUid> {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.KWHzl = fragment;
            this.EZpvd = str;
            this.AEQbTJ = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.okinc.planet.biz_userprofile.data.PlanetUid */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.okinc.planet.biz_userprofile.data.PlanetUid, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final PlanetUid invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle arguments = this.KWHzl.getArguments();
            java.lang.String str = this.EZpvd;
            ?? r2 = this.AEQbTJ;
            if (arguments == null || !arguments.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(PlanetUid.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(arguments.getInt(str));
                    obj = (PlanetUid) (objValueOf instanceof PlanetUid ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(arguments.getLong(str));
                    obj = (PlanetUid) (objValueOf2 instanceof PlanetUid ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(arguments.getFloat(str));
                    obj = (PlanetUid) (objValueOf3 instanceof PlanetUid ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(arguments.getDouble(str));
                    obj = (PlanetUid) (objValueOf4 instanceof PlanetUid ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(arguments.getBoolean(str));
                    obj = (PlanetUid) (objValueOf5 instanceof PlanetUid ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    java.lang.Object string = arguments.getString(str);
                    obj = (PlanetUid) (string instanceof PlanetUid ? string : null);
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable(str, PlanetUid.class);
                } else {
                    java.lang.Object parcelable2 = arguments.getParcelable(str);
                    obj = (PlanetUid) (parcelable2 instanceof PlanetUid ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = arguments.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.okinc.planet.biz_userprofile.data.PlanetUid");
                }
                parcelable = (PlanetUid) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = arguments.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.okinc.planet.biz_userprofile.data.PlanetUid");
                }
                parcelable = (PlanetUid) parcelableArrayList2;
            }
            obj = parcelable;
            if (obj != null) {
            }
        }
    }

    public static final class Dialog implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;
        public final /* synthetic */ java.lang.Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.EZpvd = fragment;
            this.AEQbTJ = str;
            this.copydefault = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle arguments = this.EZpvd.getArguments();
            java.lang.String str = this.AEQbTJ;
            ?? r2 = this.copydefault;
            if (arguments == null || !arguments.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.String.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(arguments.getInt(str));
                    obj = (java.lang.String) (objValueOf instanceof java.lang.String ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(arguments.getLong(str));
                    obj = (java.lang.String) (objValueOf2 instanceof java.lang.String ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(arguments.getFloat(str));
                    obj = (java.lang.String) (objValueOf3 instanceof java.lang.String ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(arguments.getDouble(str));
                    obj = (java.lang.String) (objValueOf4 instanceof java.lang.String ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(arguments.getBoolean(str));
                    obj = (java.lang.String) (objValueOf5 instanceof java.lang.String ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    parcelable = arguments.getString(str);
                    if (parcelable instanceof java.lang.String) {
                    }
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable(str, java.lang.String.class);
                } else {
                    java.lang.Object parcelable2 = arguments.getParcelable(str);
                    obj = (java.lang.String) (parcelable2 instanceof java.lang.String ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = arguments.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = arguments.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) parcelableArrayList2;
            }
            obj = parcelable;
            if (obj != null) {
            }
        }
    }

    public static final class Fragment implements Function0<java.lang.String> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;
        public final /* synthetic */ java.lang.Object KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.EZpvd = fragment;
            this.OLrzqt = str;
            this.KWHzl = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle arguments = this.EZpvd.getArguments();
            java.lang.String str = this.OLrzqt;
            ?? r2 = this.KWHzl;
            if (arguments == null || !arguments.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.String.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(arguments.getInt(str));
                    obj = (java.lang.String) (objValueOf instanceof java.lang.String ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(arguments.getLong(str));
                    obj = (java.lang.String) (objValueOf2 instanceof java.lang.String ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(arguments.getFloat(str));
                    obj = (java.lang.String) (objValueOf3 instanceof java.lang.String ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(arguments.getDouble(str));
                    obj = (java.lang.String) (objValueOf4 instanceof java.lang.String ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(arguments.getBoolean(str));
                    obj = (java.lang.String) (objValueOf5 instanceof java.lang.String ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    parcelable = arguments.getString(str);
                    if (parcelable instanceof java.lang.String) {
                    }
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable(str, java.lang.String.class);
                } else {
                    java.lang.Object parcelable2 = arguments.getParcelable(str);
                    obj = (java.lang.String) (parcelable2 instanceof java.lang.String ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = arguments.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = arguments.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) parcelableArrayList2;
            }
            obj = parcelable;
            if (obj != null) {
            }
        }
    }

    public static final class LoaderManager implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.KWHzl = fragment;
            this.OLrzqt = str;
            this.AEQbTJ = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle arguments = this.KWHzl.getArguments();
            java.lang.String str = this.OLrzqt;
            ?? r2 = this.AEQbTJ;
            if (arguments == null || !arguments.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.String.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(arguments.getInt(str));
                    obj = (java.lang.String) (objValueOf instanceof java.lang.String ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(arguments.getLong(str));
                    obj = (java.lang.String) (objValueOf2 instanceof java.lang.String ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(arguments.getFloat(str));
                    obj = (java.lang.String) (objValueOf3 instanceof java.lang.String ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(arguments.getDouble(str));
                    obj = (java.lang.String) (objValueOf4 instanceof java.lang.String ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(arguments.getBoolean(str));
                    obj = (java.lang.String) (objValueOf5 instanceof java.lang.String ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    parcelable = arguments.getString(str);
                    if (parcelable instanceof java.lang.String) {
                    }
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable(str, java.lang.String.class);
                } else {
                    java.lang.Object parcelable2 = arguments.getParcelable(str);
                    obj = (java.lang.String) (parcelable2 instanceof java.lang.String ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = arguments.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = arguments.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) parcelableArrayList2;
            }
            obj = parcelable;
            if (obj != null) {
            }
        }
    }

    public static final class PendingIntent implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.KWHzl = fragment;
            this.copydefault = str;
            this.AEQbTJ = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle arguments = this.KWHzl.getArguments();
            java.lang.String str = this.copydefault;
            ?? r2 = this.AEQbTJ;
            if (arguments == null || !arguments.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.String.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(arguments.getInt(str));
                    obj = (java.lang.String) (objValueOf instanceof java.lang.String ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(arguments.getLong(str));
                    obj = (java.lang.String) (objValueOf2 instanceof java.lang.String ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(arguments.getFloat(str));
                    obj = (java.lang.String) (objValueOf3 instanceof java.lang.String ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(arguments.getDouble(str));
                    obj = (java.lang.String) (objValueOf4 instanceof java.lang.String ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(arguments.getBoolean(str));
                    obj = (java.lang.String) (objValueOf5 instanceof java.lang.String ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    parcelable = arguments.getString(str);
                    if (parcelable instanceof java.lang.String) {
                    }
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable(str, java.lang.String.class);
                } else {
                    java.lang.Object parcelable2 = arguments.getParcelable(str);
                    obj = (java.lang.String) (parcelable2 instanceof java.lang.String ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = arguments.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = arguments.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) parcelableArrayList2;
            }
            obj = parcelable;
            if (obj != null) {
            }
        }
    }

    public static final class TaskDescription implements Function0<PlanetUniqueName> {
        public final /* synthetic */ java.lang.Object EZpvd;
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.KWHzl = fragment;
            this.OLrzqt = str;
            this.EZpvd = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.okinc.planet.biz_userprofile.data.PlanetUniqueName */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.okinc.planet.biz_userprofile.data.PlanetUniqueName, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final PlanetUniqueName invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle arguments = this.KWHzl.getArguments();
            java.lang.String str = this.OLrzqt;
            ?? r2 = this.EZpvd;
            if (arguments == null || !arguments.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(PlanetUniqueName.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(arguments.getInt(str));
                    obj = (PlanetUniqueName) (objValueOf instanceof PlanetUniqueName ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(arguments.getLong(str));
                    obj = (PlanetUniqueName) (objValueOf2 instanceof PlanetUniqueName ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(arguments.getFloat(str));
                    obj = (PlanetUniqueName) (objValueOf3 instanceof PlanetUniqueName ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(arguments.getDouble(str));
                    obj = (PlanetUniqueName) (objValueOf4 instanceof PlanetUniqueName ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(arguments.getBoolean(str));
                    obj = (PlanetUniqueName) (objValueOf5 instanceof PlanetUniqueName ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    java.lang.Object string = arguments.getString(str);
                    obj = (PlanetUniqueName) (string instanceof PlanetUniqueName ? string : null);
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable(str, PlanetUniqueName.class);
                } else {
                    java.lang.Object parcelable2 = arguments.getParcelable(str);
                    obj = (PlanetUniqueName) (parcelable2 instanceof PlanetUniqueName ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = arguments.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.okinc.planet.biz_userprofile.data.PlanetUniqueName");
                }
                parcelable = (PlanetUniqueName) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = arguments.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.okinc.planet.biz_userprofile.data.PlanetUniqueName");
                }
                parcelable = (PlanetUniqueName) parcelableArrayList2;
            }
            obj = parcelable;
            if (obj != null) {
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Landroidx/lifecycle/LifecycleOwner;)V */
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C46272tOe c46272tOe, @NotNull LifecycleOwner lifecycleOwner) {
        InterfaceC47502trM.Application.KWHzl(this, c46272tOe, lifecycleOwner);
    }

    public void copydefault(@NotNull Function1<? super C46272tOe, Unit> function1) {
        InterfaceC47502trM.Application.EZpvd(this, function1);
    }

    public tAN() {
        final Function0 function0 = null;
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(tLX.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_performance.ProfileOverviewFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_performance.ProfileOverviewFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0() { // from class: o.tAS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tAN.AYXKKw(this.OLrzqt);
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tAN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final tAN KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            tAN tan = new tAN();
            tan.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(PlanetUid.Key, PlanetUid.KWHzl(str)), C56390yDp.OLrzqt(PlanetAuthorId.Key, PlanetAuthorId.OLrzqt(str2)), C56390yDp.OLrzqt(PlanetUniqueName.Key, PlanetUniqueName.EZpvd(str3)), C56390yDp.OLrzqt("timePeriod", str4), C56390yDp.OLrzqt("page", str5), C56390yDp.OLrzqt(AppsFlyerProperties.CHANNEL, str6), C56390yDp.OLrzqt("community_user_center_user_location", str7)));
            return tan;
        }
    }

    public final java.lang.String valueOf() {
        return ((PlanetUniqueName) this.AkhnZx.getValue()).EZpvd();
    }

    public final java.lang.String copydefault() {
        return ((PlanetAuthorId) this.EZpvd.getValue()).copydefault();
    }

    public final java.lang.String AhwBna() {
        return ((PlanetUid) this.AhwBna.getValue()).copydefault();
    }

    private final java.lang.String DbNXlk() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public final java.lang.String gEmmrt() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public final tLX djBIcL() {
        return (tLX) this.values.getValue();
    }

    public static final ViewModelProvider.Factory AYXKKw(tAN tan) {
        FragmentActivity fragmentActivityRequireActivity = tan.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        android.content.Intent intent = tan.requireActivity().getIntent();
        return new tRJ(fragmentActivityRequireActivity, intent != null ? intent.getExtras() : null, new Function1() { // from class: o.tAR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tAN.KWHzl((SavedStateHandle) obj);
            }
        });
    }

    public static final tLX KWHzl(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new tLX(savedStateHandle, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C46272tOe c46272tOeOLrzqt = C46272tOe.OLrzqt(view);
        Intrinsics.copydefault(c46272tOeOLrzqt);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        EZpvd(c46272tOeOLrzqt, viewLifecycleOwner);
        EZpvd(c46272tOeOLrzqt);
        copydefault(new Function1() { // from class: o.tAL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tAN.EZpvd(this.AEQbTJ, (C46272tOe) obj);
            }
        });
        view.post(new java.lang.Runnable() { // from class: o.tAM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                tAN.AEQbTJ(this.EZpvd);
            }
        });
    }

    public static final Unit EZpvd(final tAN tan, C46272tOe c46272tOe) {
        OKReminder oKReminder;
        android.widget.TextView textViewGEmmrt;
        OKReminder oKReminder2;
        OKReminder oKReminder3;
        OKReminder oKReminder4;
        OKReminder oKReminder5;
        android.widget.RelativeLayout relativeLayoutAEQbTJ;
        Intrinsics.checkNotNullParameter(c46272tOe, "");
        C46272tOe c46272tOeOLrzqt = tan.OLrzqt();
        if (c46272tOeOLrzqt != null && (oKReminder5 = c46272tOeOLrzqt.valueOf) != null && (relativeLayoutAEQbTJ = oKReminder5.AEQbTJ()) != null) {
            relativeLayoutAEQbTJ.setVisibility(8);
        }
        C46272tOe c46272tOeOLrzqt2 = tan.OLrzqt();
        if (c46272tOeOLrzqt2 != null && (oKReminder4 = c46272tOeOLrzqt2.valueOf) != null) {
            oKReminder4.setStyle(0);
        }
        C46272tOe c46272tOeOLrzqt3 = tan.OLrzqt();
        if (c46272tOeOLrzqt3 != null && (oKReminder3 = c46272tOeOLrzqt3.valueOf) != null) {
            oKReminder3.setOnCloseIconCallback(new Function0() { // from class: o.tAJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return tAN.EZpvd(this.AEQbTJ);
                }
            });
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.zEHIKV);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C47501trL.Fragment.FQMcgEfQMcgE);
        C46272tOe c46272tOeOLrzqt4 = tan.OLrzqt();
        if (c46272tOeOLrzqt4 != null && (oKReminder2 = c46272tOeOLrzqt4.valueOf) != null) {
            oKReminder2.setMessage(C33061mpO.setupSpanStyles$default(strAYXKKw + " " + strAYXKKw2, new java.lang.String[]{strAYXKKw2}, 0, null, false, new Function1() { // from class: o.tAQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tAN.OLrzqt(this.OLrzqt, (java.util.List) obj);
                }
            }, 14, null));
        }
        C46272tOe c46272tOeOLrzqt5 = tan.OLrzqt();
        if (c46272tOeOLrzqt5 != null && (oKReminder = c46272tOeOLrzqt5.valueOf) != null && (textViewGEmmrt = oKReminder.gEmmrt()) != null) {
            textViewGEmmrt.setVisibility(8);
        }
        androidx.fragment.app.FragmentManager childFragmentManager = tan.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.replace(C47501trL.TaskDescription.hrNTAI, C45920tBd.Companion.copydefault(tan.copydefault(), false, tan.gEmmrt(), tan.AEQbTJ()));
        fragmentTransactionBeginTransaction.commit();
        androidx.fragment.app.FragmentManager childFragmentManager2 = tan.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction2 = childFragmentManager2.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "");
        fragmentTransactionBeginTransaction2.replace(C47501trL.TaskDescription.DbNXlk, tAU.Companion.AEQbTJ(tan.copydefault(), true));
        fragmentTransactionBeginTransaction2.commit();
        androidx.fragment.app.FragmentManager childFragmentManager3 = tan.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction3 = childFragmentManager3.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction3, "");
        fragmentTransactionBeginTransaction3.replace(C47501trL.TaskDescription.DGGHxk, tEL.Companion.KWHzl(tan.valueOf(), tan.AEQbTJ()));
        fragmentTransactionBeginTransaction3.commit();
        androidx.fragment.app.FragmentManager childFragmentManager4 = tan.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction4 = childFragmentManager4.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction4, "");
        fragmentTransactionBeginTransaction4.replace(C47501trL.TaskDescription.DGOPHZDGOPHZ, tBB.Companion.KWHzl(tan.valueOf(), tan.copydefault(), tan.EZpvd(), tan.AEQbTJ()));
        fragmentTransactionBeginTransaction4.commit();
        tan.AYXKKw();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(tAN tan) {
        OKReminder oKReminder;
        C46386tSk.copydefault.AkhnZx(C46388tSm.Companion.KWHzl().copydefault());
        C46272tOe c46272tOeOLrzqt = tan.OLrzqt();
        if (c46272tOeOLrzqt != null && (oKReminder = c46272tOeOLrzqt.valueOf) != null) {
            oKReminder.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final class Application extends android.text.style.ClickableSpan {
        public Application() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            ActivityC46114tIi.TaskDescription taskDescription = ActivityC46114tIi.Companion;
            FragmentActivity fragmentActivityRequireActivity = tAN.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            PlanetBasicUserInfoResp planetBasicUserInfoRespOLrzqt = C46388tSm.Companion.KWHzl().OLrzqt();
            tAN.this.startActivity(taskDescription.EZpvd(fragmentActivityRequireActivity, planetBasicUserInfoRespOLrzqt != null ? planetBasicUserInfoRespOLrzqt.hDKMBd() : null));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    public static final Unit OLrzqt(tAN tan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(tan.new Application());
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(tAN tan) {
        if (tan.KWHzl) {
            return;
        }
        tan.KWHzl = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) tan, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AYXKKw() {
        C46373tRy.AEQbTJ(C46388tSm.Companion.KWHzl().fIwbmz(), this, Lifecycle.State.CREATED, new ProfileOverviewFragment$observeUserDataChanges$1(this, null));
    }

    public final void KWHzl(PlanetBasicUserInfoResp planetBasicUserInfoResp) {
        OKReminder oKReminder;
        OKReminder oKReminder2;
        boolean z = (planetBasicUserInfoResp == null || planetBasicUserInfoResp.QVAiDq()) ? false : true;
        C46388tSm.TaskDescription taskDescription = C46388tSm.Companion;
        boolean zZLjUOn = C46386tSk.copydefault.zLjUOn(taskDescription.KWHzl().copydefault());
        if (z) {
            if (taskDescription.KWHzl().copydefault(AhwBna(), valueOf(), copydefault()) && zZLjUOn) {
                C46272tOe c46272tOeOLrzqt = OLrzqt();
                if (c46272tOeOLrzqt == null || (oKReminder2 = c46272tOeOLrzqt.valueOf) == null) {
                    return;
                }
                oKReminder2.setVisibility(0);
                return;
            }
        }
        C46272tOe c46272tOeOLrzqt2 = OLrzqt();
        if (c46272tOeOLrzqt2 == null || (oKReminder = c46272tOeOLrzqt2.valueOf) == null) {
            return;
        }
        oKReminder.setVisibility(8);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KWHzl(C46388tSm.Companion.KWHzl().OLrzqt());
        java.lang.String strDbNXlk = DbNXlk();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk)) {
            strDbNXlk = "other";
        }
        tTP.OLrzqt(new tBI("overview", strDbNXlk, valueOf(), djBIcL().fetchVPNInfo(), AEQbTJ()));
    }
}
