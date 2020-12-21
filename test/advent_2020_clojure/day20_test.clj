(ns advent-2020-clojure.day20-test
  (:require [clojure.test :refer :all]
            [advent-2020-clojure.day20 :refer :all]))

(def TEST_DATA "Tile 2311:\n..##.#..#.\n##..#.....\n#...##..#.\n####.#...#\n##.##.###.\n##...#.###\n.#.#.#..##\n..#....#..\n###...#.#.\n..###..###\n\nTile 1951:\n#.##...##.\n#.####...#\n.....#..##\n#...######\n.##.#....#\n.###.#####\n###.##.##.\n.###....#.\n..#.#..#.#\n#...##.#..\n\nTile 1171:\n####...##.\n#..##.#..#\n##.#..#.#.\n.###.####.\n..###.####\n.##....##.\n.#...####.\n#.##.####.\n####..#...\n.....##...\n\nTile 1427:\n###.##.#..\n.#..#.##..\n.#.##.#..#\n#.#.#.##.#\n....#...##\n...##..##.\n...#.#####\n.#.####.#.\n..#..###.#\n..##.#..#.\n\nTile 1489:\n##.#.#....\n..##...#..\n.##..##...\n..#...#...\n#####...#.\n#..#.#.#.#\n...#.#.#..\n##.#...##.\n..##.##.##\n###.##.#..\n\nTile 2473:\n#....####.\n#..#.##...\n#.##..#...\n######.#.#\n.#...#.#.#\n.#########\n.###.#..#.\n########.#\n##...##.#.\n..###.#.#.\n\nTile 2971:\n..#.#....#\n#...###...\n#.#.###...\n##.##..#..\n.#####..##\n.#..####.#\n#..#.#..#.\n..####.###\n..#.#.###.\n...#.#.#.#\n\nTile 2729:\n...#.#.#.#\n####.#....\n..#.#.....\n....#..#.#\n.##..##.#.\n.#.####...\n####.#.#..\n##.####...\n##..#.##..\n#.##...##.\n\nTile 3079:\n#.#.#####.\n.#..######\n..#.......\n######....\n####.#..#.\n.#...#.##.\n#.#####.##\n..#.###...\n..#.......\n..#.###...")
(def PUZZLE_DATA (slurp "resources/day20_data.txt"))

(deftest left-of?-test
  (is (true? (left-of? [1 ["...#" "..##" "###."]] [2 ["###." "##.." "...."]])))
  (is (false? (left-of? [1 ["...#" "..##" "###."]] [2 ["###." "##.." "#..."]]))))

(deftest above?-test
  (is (true? (above? [1 ["...#" "..##" "###."]] [2 ["###." "##.." "...."]])))
  (is (false? (above? [1 ["...#" "..##" "###."]] [2 [".##." "##.." "...."]]))))

(deftest part1-test
  (is (= 20899048083289 (part1 TEST_DATA)))
  (is (= 5966506063747 (part1 PUZZLE_DATA))))

#_(deftest part2-test
  (is (=  (part2 TEST_DATA)))
  (is (=  (part2 PUZZLE_DATA))))
