package o;

import aws.smithy.kotlin.runtime.net.url.UrlPath$Builder$decodedSegments$1;
import aws.smithy.kotlin.runtime.net.url.UrlPath$Builder$decodedSegments$2;
import aws.smithy.kotlin.runtime.net.url.UrlPath$Builder$encodedSegments$2;
import aws.smithy.kotlin.runtime.net.url.UrlPath$Builder$parseDecoded$1;
import aws.smithy.kotlin.runtime.net.url.UrlPath$Builder$parseEncoded$1;
import com.fasterxml.jackson.core.JsonPointer;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt__StringsKt;
import o.C5166Hg;
import o.C5167Hh;
import o.DM;
import o.DS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DS {
    public static final DS KWHzl;
    public static final ActionBar copydefault;
    public final java.util.List<C5166Hg> AEQbTJ;
    public final boolean EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.util.List), (r2v0 boolean) A[MD:(java.util.List<o.Hg>, boolean):void (m)] call: o.DS.<init>(java.util.List, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DS(java.util.List list, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C5166Hg> KWHzl() {
        return this.AEQbTJ;
    }

    public DS(java.util.List<C5166Hg> list, boolean z) {
        this.AEQbTJ = list;
        this.EZpvd = z;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final DS EZpvd(@NotNull Function1<? super TaskDescription, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            TaskDescription taskDescription = new TaskDescription();
            function1.invoke(taskDescription);
            return taskDescription.OLrzqt();
        }

        public final java.lang.String EZpvd(java.util.List<C5166Hg> list, boolean z) {
            return OLrzqt(list, z, new PropertyReference1Impl() { // from class: aws.smithy.kotlin.runtime.net.url.UrlPath$Companion$asEncoded$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((C5166Hg) obj).AEQbTJ();
                }
            });
        }

        public final java.lang.String OLrzqt(java.util.List<C5166Hg> list, boolean z, Function1<? super C5166Hg, java.lang.String> function1) {
            return CollectionsKt___CollectionsKt.joinToString$default(list, "/", list.isEmpty() ? "" : "/", z ? "/" : "", 0, null, function1, 24, null);
        }
    }

    static {
        ActionBar actionBar = new ActionBar(null);
        copydefault = actionBar;
        KWHzl = actionBar.EZpvd(new Function1<TaskDescription, Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.UrlPath$Companion$Empty$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DS.TaskDescription taskDescription) {
                Intrinsics.checkNotNullParameter(taskDescription, "");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DS.TaskDescription taskDescription) {
                invoke2(taskDescription);
                return Unit.INSTANCE;
            }
        });
    }

    public final TaskDescription copydefault() {
        return new TaskDescription(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DS.class != obj.getClass()) {
            return false;
        }
        DS ds = (DS) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, ds.AEQbTJ) && this.EZpvd == ds.EZpvd;
    }

    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    public final java.lang.String AEQbTJ() {
        return copydefault.EZpvd(this.AEQbTJ, this.EZpvd);
    }

    public java.lang.String toString() {
        return AEQbTJ();
    }

    public static final class TaskDescription {
        public final java.util.List<C5166Hg> AEQbTJ;
        public boolean EZpvd;
        public final java.util.List<java.lang.String> OLrzqt;
        public final java.util.List<java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C5166Hg> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.EZpvd = z;
        }

        public TaskDescription(DS ds) {
            java.util.List<C5166Hg> listKWHzl;
            java.util.List<C5166Hg> arrayList = (ds == null || (listKWHzl = ds.KWHzl()) == null || (arrayList = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) listKWHzl)) == null) ? new java.util.ArrayList<>() : arrayList;
            this.AEQbTJ = arrayList;
            UrlPath$Builder$decodedSegments$1 urlPath$Builder$decodedSegments$1 = new PropertyReference1Impl() { // from class: aws.smithy.kotlin.runtime.net.url.UrlPath$Builder$decodedSegments$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((C5166Hg) obj).OLrzqt();
                }
            };
            C5167Hh.ActionBar actionBar = C5167Hh.KWHzl;
            this.copydefault = C56617yM.OLrzqt((java.util.List) arrayList, (Function1) urlPath$Builder$decodedSegments$1, (Function1) new UrlPath$Builder$decodedSegments$2(actionBar.KWHzl()));
            this.OLrzqt = C56617yM.OLrzqt((java.util.List) arrayList, (Function1) new PropertyReference1Impl() { // from class: aws.smithy.kotlin.runtime.net.url.UrlPath$Builder$encodedSegments$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((C5166Hg) obj).AEQbTJ();
                }
            }, (Function1) new UrlPath$Builder$encodedSegments$2(actionBar.KWHzl()));
            this.EZpvd = ds != null ? ds.EZpvd() : false;
        }

        public TaskDescription() {
            this(null);
        }

        public final java.lang.String AEQbTJ() {
            return DS.copydefault.EZpvd(this.AEQbTJ, this.EZpvd);
        }

        public final void EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            OLrzqt(str);
        }

        public final void EZpvd(@NotNull Function1<? super java.util.List<java.lang.String>, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(this.OLrzqt);
        }

        public final void copydefault() {
            java.util.ListIterator<C5166Hg> listIterator = this.AEQbTJ.listIterator();
            while (listIterator.hasNext()) {
                java.lang.String strOLrzqt = listIterator.next().OLrzqt();
                int iHashCode = strOLrzqt.hashCode();
                if (iHashCode != 0) {
                    if (iHashCode != 46) {
                        if (iHashCode == 1472 && strOLrzqt.equals("..")) {
                            listIterator.remove();
                            if (!listIterator.hasPrevious()) {
                                throw new java.lang.IllegalStateException("Cannot normalize because \"..\" has no parent".toString());
                            }
                            listIterator.previous();
                            listIterator.remove();
                        }
                    } else if (strOLrzqt.equals(JwtUtilsKt.JWT_DELIMITER)) {
                        listIterator.remove();
                    }
                } else if (strOLrzqt.equals("")) {
                    listIterator.remove();
                }
            }
            if (this.AEQbTJ.isEmpty()) {
                this.EZpvd = true;
            }
        }

        public final void KWHzl(@NotNull java.lang.String str, @NotNull DM dm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dm, "");
            if (dm.copydefault(DM.Activity.EZpvd)) {
                OLrzqt(str);
            } else {
                AEQbTJ(str);
            }
        }

        public final void AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            copydefault(str, new UrlPath$Builder$parseDecoded$1(C5167Hh.KWHzl.KWHzl()));
        }

        public final void OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            copydefault(str, new UrlPath$Builder$parseEncoded$1(C5167Hh.KWHzl.KWHzl()));
        }

        public final void copydefault(java.lang.String str, Function1<? super java.lang.String, C5166Hg> function1) {
            this.AEQbTJ.clear();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "")) {
                this.EZpvd = false;
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "/")) {
                this.EZpvd = true;
                return;
            }
            java.lang.String strKWHzl = StringsKt__StringsKt.KWHzl(str, (java.lang.CharSequence) "/");
            boolean zEndsWith$default = StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strKWHzl, JsonPointer.SEPARATOR, false, 2, (java.lang.Object) null);
            this.EZpvd = zEndsWith$default;
            if (zEndsWith$default) {
                strKWHzl = StringsKt__StringsKt.EZpvd(strKWHzl, (java.lang.CharSequence) "/");
            }
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strKWHzl, new char[]{JsonPointer.SEPARATOR}, false, 0, 6, (java.lang.Object) null);
            java.util.List<C5166Hg> list = this.AEQbTJ;
            java.util.Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                list.add(function1.invoke(it.next()));
            }
        }

        public final DS OLrzqt() {
            return new DS(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.AEQbTJ), this.EZpvd, null);
        }

        public final void AEQbTJ(@NotNull DS ds) {
            Intrinsics.checkNotNullParameter(ds, "");
            this.AEQbTJ.clear();
            this.AEQbTJ.addAll(ds.KWHzl());
            this.EZpvd = ds.EZpvd();
        }

        public final void EZpvd(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.AEQbTJ.clear();
            this.AEQbTJ.addAll(taskDescription.AEQbTJ);
            this.EZpvd = taskDescription.EZpvd;
        }
    }
}
