(ns examples.align
  (:require
    [clojure.string :as str]
    [io.github.humbleui.ui :as ui])
  (:import
    [io.github.humbleui.skija Paint]))

(set! *warn-on-reflection* true)

(defn label [text]
  (ui/dynamic ctx [{:keys [font-ui fill-text]} ctx]
    (ui/fill (doto (Paint.) (.setColor (unchecked-int 0xFFB2D7FE)))
      (ui/halign 0.5
        (ui/valign 0.5
          (ui/padding 10 10
            (ui/label text font-ui fill-text)))))))

(def ui
  (ui/valign 0.5
    (ui/row
      [:stretch 1 nil]
      [:stretch 2 (ui/fill (doto (Paint.) (.setColor (unchecked-int 0xFFE1EFFA)))
                    (ui/column
                      [:stretch 1 (ui/halign 1 0   (label "Right to left"))]
                      (ui/gap 0 1)
                      [:stretch 1 (ui/halign 0.5 0 (label "Center to left"))]
                      (ui/gap 0 1)
                      [:stretch 1 (ui/halign 0     (label "Left to left"))]
                      (ui/gap 0 1)
                      [:stretch 1 (ui/halign 1 0.5 (label "Right to center"))]
                      (ui/gap 0 1)
                      [:stretch 1 (ui/halign 0.5   (label "Center to center"))]
                      (ui/gap 0 1)
                      [:stretch 1 (ui/halign 0 0.5 (label "Left to center"))]
                      (ui/gap 0 1)
                      [:stretch 1 (ui/halign 1 1   (label "Right to right"))]
                      (ui/gap 0 1)
                      [:stretch 1 (ui/halign 0.5 1 (label "Center to right"))]
                      (ui/gap 0 1)
                      [:stretch 1 (ui/halign 0 1   (label "Left to right"))]
                      (ui/gap 0 1)
                      [:stretch 1 (label "Stretch")]))]
      [:stretch 1 nil]
      [:stretch 2 (ui/fill (doto (Paint.) (.setColor (unchecked-int 0xFFE1EFFA)))
                    (ui/row
                      [:stretch 1 (ui/valign 1 0   (label "Bottom to top"))]
                      (ui/gap 1 0)
                      [:stretch 1 (ui/valign 0.5 0 (label "Middle to top"))]
                      (ui/gap 1 0)
                      [:stretch 1 (ui/valign 0     (label "Top to top"))]
                      (ui/gap 1 0)
                      [:stretch 1 (ui/valign 1 0.5 (label "Bottom to middle"))]
                      (ui/gap 1 0)
                      [:stretch 1 (ui/valign 0.5   (label "Middle to middle"))]
                      (ui/gap 1 0)
                      [:stretch 1 (ui/valign 0 0.5 (label "Top to middle"))]
                      (ui/gap 1 0)
                      [:stretch 1 (ui/valign 1 1   (label "Bottom to bottom"))]
                      (ui/gap 1 0)
                      [:stretch 1 (ui/valign 0.5 1 (label "Middle to bottom"))]
                      (ui/gap 1 0)
                      [:stretch 1 (ui/valign 0 1   (label "Top to bottom"))]
                      (ui/gap 1 0)
                      [:stretch 1 (label "Stretch")]))]
      [:stretch 1 nil])))