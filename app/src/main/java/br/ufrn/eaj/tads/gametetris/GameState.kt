package br.ufrn.eaj.tads.gametetris

import android.widget.ImageView
import br.ufrn.eaj.tads.gametetris.parts.Part
import br.ufrn.eaj.tads.gametetris.parts.PartI

class GameState {
    companion object {
        var saved = false
        var points: Int = 0
        var board = Array(36) {
            Array(20) { 0 }
        }
        var part: Part = PartI(0, 0)

        fun resetState() {
            saved = false
            points = 0
            board = Array(36) {
                Array(20) { 0 }
            }
            part = PartI(0, 0)
        }

        fun saveState(p:Int, b:Array<Array<Int>>, pt: Part) {
            saved = true
            points = p
            board = b
            part = pt
        }
    }
}